package com.aviatar.rock_scissors_paper.domain.game_implementations;

import com.aviatar.rock_scissors_paper.domain.model.Game;
import com.aviatar.rock_scissors_paper.domain.model.Player;

import java.util.List;

public interface RockPaperScissorsFactoryProvider {
    public Game createRockScissorsTypeGame(List<Player> players);
}
