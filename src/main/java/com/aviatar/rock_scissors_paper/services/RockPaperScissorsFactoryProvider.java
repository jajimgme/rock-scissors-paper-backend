package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.Game;
import com.aviatar.rock_scissors_paper.domain.Player;

import java.util.List;

public interface RockPaperScissorsFactoryProvider {
    public Game createRockScissorsTypeGame(List<Player> players);
}
