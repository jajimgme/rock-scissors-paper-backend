package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.GameResult;
import com.aviatar.rock_scissors_paper.domain.GameResultTypes;
import com.aviatar.rock_scissors_paper.domain.Pick;

public class TwoPlayersGameRules implements GameRuleSet {

    public GameResult Play(Pick player1pick, Pick player2pick) {
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
