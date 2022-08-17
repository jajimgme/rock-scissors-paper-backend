package com.aviatar.rock_scissors_paper.domain;

import com.aviatar.rock_scissors_paper.domain.model.Game;
import com.aviatar.rock_scissors_paper.domain.model.Player;

import java.util.List;

public interface GameFactory {

    public Game createGame(List<Player> players);
}