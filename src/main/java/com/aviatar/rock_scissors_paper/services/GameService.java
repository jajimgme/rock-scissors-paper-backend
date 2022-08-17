package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.model.GameDescription;
import com.aviatar.rock_scissors_paper.domain.model.GameType;
import com.aviatar.rock_scissors_paper.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService implements IGameService {
    private GameRepository gameRepository;

    public GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    @Override
    public List<GameDescription> getGames(){
        return gameRepository.getAvailableGames();
    }

    public GameDescription getDescriptionOfGameType(GameType gameType){
        return gameRepository.getDescriptionOfGameType(gameType);
    }
}
