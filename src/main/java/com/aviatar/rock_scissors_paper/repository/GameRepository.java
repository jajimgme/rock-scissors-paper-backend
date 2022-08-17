package com.aviatar.rock_scissors_paper.repository;

import com.aviatar.rock_scissors_paper.domain.model.GameDescription;
import com.aviatar.rock_scissors_paper.domain.model.GameType;
import com.aviatar.rock_scissors_paper.domain.model.RockPaperScissorsGameDescription;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class GameRepository {
    List<GameDescription> games;
    public GameRepository(){
        GameDescription game = new GameDescription();
        game.setGameType(new GameType("Classic picks rock paper scissors", 2));
        games = Arrays.asList(game);
    }
    public List<GameDescription> getAvailableGames(){
        return games;
    }

    public GameDescription getDescriptionOfGameType(GameType g) {
        return findGame(g);
    }

    private GameDescription findGame(GameType gameType){
           Optional<GameDescription> first = this.games.stream().filter(g -> g.getGameType().getName().equals(gameType.getName())).findFirst();
           if(first.isPresent()){
               return first.get();
           } else {
               throw new RuntimeException("That gametype is not available in this service");
           }
       }

}