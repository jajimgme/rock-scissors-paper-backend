package com.test.rock_scissors_paper.domain;

import com.test.rock_scissors_paper.domain.model.GameResult;
import com.test.rock_scissors_paper.domain.model.Play;

public interface GameEngine {
    GameResult play(Play p);
}
