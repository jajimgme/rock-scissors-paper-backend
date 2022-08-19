package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.GameEngine;
import com.aviatar.rock_scissors_paper.domain.model.GameDescription;
import com.aviatar.rock_scissors_paper.domain.model.GameResult;
import com.aviatar.rock_scissors_paper.domain.model.GameType;
import com.aviatar.rock_scissors_paper.domain.model.Play;
import com.aviatar.rock_scissors_paper.repository.GameRepository;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class GameService implements IGameService {
    private GameRepository gameRepository;
    @Getter(AccessLevel.PROTECTED)
    @Setter(AccessLevel.PROTECTED)
    private GameEngine gameEngine;

    public GameService(GameRepository gameRepository, GameEngine gameEngine){
        this.gameRepository = gameRepository;
        this.gameEngine = gameEngine;
    }




    @Override
    public List<GameDescription> getGames(){
        return gameRepository.getAvailableGames();
    }

    public GameDescription getDescriptionOfGameType(GameType gameType){
        return gameRepository.getDescriptionOfGameType(gameType);
    }

    public GameResult playGame(Play p){
        return gameEngine.play(p);
    }
}
