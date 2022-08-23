package com.test.rock_scissors_paper.services;

import com.test.rock_scissors_paper.domain.model.GameDescription;

import java.util.List;

public interface IGameService {
    List<GameDescription> getGames();
}
