package com.test.rock_scissors_paper.domain;

import com.test.rock_scissors_paper.domain.model.Game;
import com.test.rock_scissors_paper.domain.model.Player;

import java.util.List;

public interface GameFactory {

    Game createGame(List<Player> players);
}