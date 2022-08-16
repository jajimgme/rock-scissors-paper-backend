package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.*;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class RockPaperScissorsGameFactory {
    private GameFactoryProvider gameFactoryProvider;

    public RockPaperScissorsGameFactory( GameFactoryProvider gameFactoryProvider){
        this.gameFactoryProvider = gameFactoryProvider;
    }
    @NonNull
    public Game createGame(List<Player> players){
        return gameFactoryProvider.createGame(players);
    }

}

