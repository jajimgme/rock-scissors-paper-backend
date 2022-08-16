package com.aviatar.rock_scissors_paper.domain;

import java.util.List;

public interface GamePickFactoryProvider {
    List<GamePick> createGamePicks();
}
