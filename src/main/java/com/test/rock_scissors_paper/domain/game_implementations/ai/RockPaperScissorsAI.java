package com.test.rock_scissors_paper.domain.game_implementations.ai;

import com.test.rock_scissors_paper.domain.model.GamePick;

import java.util.List;

public class RockPaperScissorsAI implements GameAI {
    private final List<GamePick> availableGamePicks;

    public RockPaperScissorsAI(List<GamePick> availableGamePicks) {
        this.availableGamePicks = availableGamePicks;
    }


    @Override
    public GamePick generatePick() {
        int numberOfChoices = this.availableGamePicks.size();
        int machineChoice = (int) (Math.random() * numberOfChoices);
        return this.availableGamePicks.get(machineChoice);
    }
}
