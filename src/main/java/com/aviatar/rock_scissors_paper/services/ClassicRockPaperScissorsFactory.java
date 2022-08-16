package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.Game;
import com.aviatar.rock_scissors_paper.domain.GamePick;
import com.aviatar.rock_scissors_paper.domain.GamePickFactoryProvider;
import com.aviatar.rock_scissors_paper.domain.Player;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class ClassicRockPaperScissorsFactory implements RockPaperScissorsFactoryProvider {

    private final GamePickFactoryProvider gamePickFactoryProvider = new RockPaperScissorsClassicPicksFactory();

    public Game CreateTwoPlayersClassicGame(Player player1, Player player2) {
        GameRuleSet gameRuleSet = new TwoPlayersGameRules();
        List<GamePick> gamePicks = this.gamePickFactoryProvider.createGamePicks();
        return new Game(gameRuleSet, gamePicks, Arrays.asList(player1, player2));
    }

    @Override

    public Game createRockScissorsTypeGame(List<Player> players) {
        if(players.size() != 2){
            throw new IllegalArgumentException("The only acceptable number of players for this implementation of the game is 2.");
        }

        return CreateTwoPlayersClassicGame(players.get(0), players.get(1));
    }
}
