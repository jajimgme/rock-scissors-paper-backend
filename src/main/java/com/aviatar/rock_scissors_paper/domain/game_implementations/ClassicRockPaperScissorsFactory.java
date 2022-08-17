package com.aviatar.rock_scissors_paper.domain.game_implementations;

import com.aviatar.rock_scissors_paper.domain.game_implementations.game_engine.TwoPlayersGameRulesEngine;
import com.aviatar.rock_scissors_paper.domain.game_implementations.game_picks.RockPaperScissorsClassicPicksFactory;
import com.aviatar.rock_scissors_paper.domain.model.Game;
import com.aviatar.rock_scissors_paper.domain.model.GamePick;
import com.aviatar.rock_scissors_paper.domain.model.Player;
import com.aviatar.rock_scissors_paper.domain.GameEngine;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ClassicRockPaperScissorsFactory implements RockPaperScissorsFactoryProvider {

    private final GamePickFactoryProvider gamePickFactoryProvider = new RockPaperScissorsClassicPicksFactory();

    private Game CreateTwoPlayersClassicGame(Player player1, Player player2) {
        List<GamePick> gamePicks = this.gamePickFactoryProvider.createGamePicks();
        GameEngine gameRuleEngine = new TwoPlayersGameRulesEngine();
        return new Game(gameRuleEngine, gamePicks, Arrays.asList(player1, player2));
    }

    @Override
    public Game createRockScissorsTypeGame(List<Player> players) {
        if(players.size() != 2){
            throw new IllegalArgumentException("The only acceptable number of players for this implementation of the game is 2.");
        }

        return CreateTwoPlayersClassicGame(players.get(0), players.get(1));
    }
}
