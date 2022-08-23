package com.test.rock_scissors_paper.domain.game_implementations.game_engine;

import com.test.rock_scissors_paper.domain.GameEngine;
import com.test.rock_scissors_paper.domain.model.*;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoPlayersGameRulesEngine implements GameEngine {

    private final Map<PossiblePicksType, HashSet<PossiblePicksType>> possiblePicksRules;

    public TwoPlayersGameRulesEngine(List<GamePick> possiblePicks){

        possiblePicksRules = possiblePicks.stream().collect(Collectors.toMap(GamePick::getType, g -> g.getDefeats()));
    }
    public GameResult play(Play play) {
        Pick player1Pick = play.getPicks().get(0);
        Pick player2Pick = play.getPicks().get(1);
        PossiblePicksType player1pickType = player1Pick.getPick().getType();
        PossiblePicksType player2pickType = player2Pick.getPick().getType();

        if (player1pickType == player2pickType) {
            return new GameResult(GameResultTypes.TIE);
        }
        if (defeats(player1pickType, player2pickType)) {
            return new GameResult(GameResultTypes.PLAYER_WINS, player1Pick.getPlayer());
        } else {
            return new GameResult(GameResultTypes.PLAYER_WINS, player2Pick.getPlayer());
        }

    }
    private boolean defeats(PossiblePicksType pick, PossiblePicksType pick2) {
        if(!possiblePicksRules.containsKey(pick)){
            throw new RuntimeException("That pick is not possible in this game!");
        }

        HashSet<PossiblePicksType> possiblePicksTypes = possiblePicksRules.get(pick);
        return possiblePicksTypes.contains(pick2);
    }
}
