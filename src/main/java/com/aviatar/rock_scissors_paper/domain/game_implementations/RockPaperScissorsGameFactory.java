package com.aviatar.rock_scissors_paper.domain.game_implementations;

import com.aviatar.rock_scissors_paper.domain.model.Game;
import com.aviatar.rock_scissors_paper.domain.model.GameType;
import com.aviatar.rock_scissors_paper.domain.model.Player;
import com.aviatar.rock_scissors_paper.domain.GameFactory;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RockPaperScissorsGameFactory implements GameFactory {
    private RockPaperScissorsFactoryProvider gameFactoryProvider;

    public RockPaperScissorsGameFactory( RockPaperScissorsFactoryProvider gameFactoryProvider){
        this.gameFactoryProvider = gameFactoryProvider;
    }
    @NonNull
    public Game createGame(List<Player> players){
        return gameFactoryProvider.createRockScissorsTypeGame(players);
    }


}

