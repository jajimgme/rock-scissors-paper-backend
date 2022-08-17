package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.model.GameDescription;

import java.util.List;

public interface IGameService {
    List<GameDescription> getGames();
}
