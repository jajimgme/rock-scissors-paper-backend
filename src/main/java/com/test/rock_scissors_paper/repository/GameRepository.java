package com.test.rock_scissors_paper.repository;

import com.test.rock_scissors_paper.domain.model.GameDescription;
import com.test.rock_scissors_paper.domain.model.GameType;

import java.util.List;

public interface GameRepository {
    List<GameDescription> getAvailableGames();

    GameDescription getDescriptionOfGameType(GameType g);
}
