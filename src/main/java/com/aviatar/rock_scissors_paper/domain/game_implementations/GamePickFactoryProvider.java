package com.aviatar.rock_scissors_paper.domain.game_implementations;

import com.aviatar.rock_scissors_paper.domain.model.GamePick;

import java.util.List;

public interface GamePickFactoryProvider {
    List<GamePick> createGamePicks();
}
