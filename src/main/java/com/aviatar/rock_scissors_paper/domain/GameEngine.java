package com.aviatar.rock_scissors_paper.domain;

import com.aviatar.rock_scissors_paper.domain.model.GameResult;
import com.aviatar.rock_scissors_paper.domain.model.Play;

public interface GameEngine {
    GameResult play(Play p);
}
