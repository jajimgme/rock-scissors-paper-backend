package com.aviatar.rock_scissors_paper.domain.game_implementations.game_engine;

import com.aviatar.rock_scissors_paper.domain.model.*;
import com.aviatar.rock_scissors_paper.domain.GameEngine;

import java.util.List;

public class TwoPlayersGameRulesEngine implements GameEngine {

    public GameResult play(Play play) {
        Pick player1pick = play.getPicks().get(0);
        Pick player2pick = play.getPicks().get(1);

        if (player1pick.getPick().type == player2pick.getPick().type) {
            return new GameResult(GameResultTypes.TIE);
        }
        if (player1pick.getPick().defeats(player2pick.getPick().type)) {
            return new GameResult(GameResultTypes.PLAYER_WINS, player1pick.getPlayer());
        } else {
            return new GameResult(GameResultTypes.PLAYER_WINS, player2pick.getPlayer());
        }
    }
}
