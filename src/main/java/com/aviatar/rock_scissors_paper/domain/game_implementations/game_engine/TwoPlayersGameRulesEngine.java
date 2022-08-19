package com.aviatar.rock_scissors_paper.domain.game_implementations.game_engine;

import com.aviatar.rock_scissors_paper.domain.model.*;
import com.aviatar.rock_scissors_paper.domain.GameEngine;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
public class TwoPlayersGameRulesEngine implements GameEngine {


    private RulesChecker rulesChecker;

    public TwoPlayersGameRulesEngine(RulesChecker rulesChecker){

        this.rulesChecker = rulesChecker;
    }
    public GameResult play(Play play) {
        Pick player1Pick = play.getPicks().get(0);
        Pick player2Pick = play.getPicks().get(1);
        PossiblePicksType player1pickType = player1Pick.getPick().getType();
        PossiblePicksType player2pickType = player2Pick.getPick().getType();

        if (player1pickType == player2pickType) {
            return new GameResult(GameResultTypes.TIE);
        }
        if (rulesChecker.defeats(player1pickType, player2pickType)) {
            return new GameResult(GameResultTypes.PLAYER_WINS, player1Pick.getPlayer());
        } else {
            return new GameResult(GameResultTypes.PLAYER_WINS, player2Pick.getPlayer());
        }
    }
}
