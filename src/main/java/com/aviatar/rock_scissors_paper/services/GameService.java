package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.model.Game;
import com.aviatar.rock_scissors_paper.dto.CreateGameDto;
import com.aviatar.rock_scissors_paper.domain.game_implementations.RockPaperScissorsGameFactory;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    private RockPaperScissorsGameFactory rockPaperScissorsGameFactory;

    public GameService(RockPaperScissorsGameFactory rockPaperScissorsGameFactory){

        this.rockPaperScissorsGameFactory = rockPaperScissorsGameFactory;
    }

    public Game createGame(CreateGameDto createGame) throws ExecutionControl.NotImplementedException {
        if(createGame.gameType.getName() == "Classic rock scissors paper game" ){
            return this.rockPaperScissorsGameFactory.createGame(createGame.playerList);
        } else
        {
            throw new ExecutionControl.NotImplementedException("There are not any other games implemented yet.");
        }


    }
}
