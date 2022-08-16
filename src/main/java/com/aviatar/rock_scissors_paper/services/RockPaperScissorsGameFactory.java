package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.*;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RockPaperScissorsGameFactory implements GameFactory{
    private RockPaperScissorsFactoryProvider gameFactoryProvider;

    public RockPaperScissorsGameFactory( RockPaperScissorsFactoryProvider gameFactoryProvider){
        this.gameFactoryProvider = gameFactoryProvider;
    }
    @NonNull
    public Game createGame(List<Player> players){
        return gameFactoryProvider.createRockScissorsTypeGame(players);
    }

}

