package com.test.rock_scissors_paper.repository;

import com.test.rock_scissors_paper.domain.model.GameDescription;
import com.test.rock_scissors_paper.domain.model.GameType;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Repository
public class GameRepository {
    List<GameDescription> games;

    public GameRepository() {
        GameDescription game = new GameDescription();
        game.setNumberOfPlayers(2);
        game.setDescriptionOfTheRules("This is the classic instance of the rock, paper, scissors game.");
        game.setGameType(new GameType(1, "Classic picks rock paper scissors"));
        game.setPlayingEndpoint("/rock-paper-scissor/");
        games = Arrays.asList(game);
    }

    public List<GameDescription> getAvailableGames() {
        return games;
    }

    public GameDescription getDescriptionOfGameType(GameType g) {
        return findGame(g);
    }

    private GameDescription findGame(GameType gameType) {
        Optional<GameDescription> first = this.games.stream().filter(g -> g.getGameType().getId() == gameType.getId()).findFirst();
        if (first.isPresent()) {
            return first.get();
        } else {
            throw new RuntimeException("That gametype is not available in this service");
        }
    }

}
