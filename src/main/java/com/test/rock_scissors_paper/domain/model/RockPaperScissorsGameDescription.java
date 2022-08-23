package com.test.rock_scissors_paper.domain.model;

import lombok.Data;

import java.util.List;

@Data
public class RockPaperScissorsGameDescription extends GameDescription {
    private List<GamePick> availablePicks;

    public RockPaperScissorsGameDescription(GameDescription g) {
        this.setDescriptionOfTheRules(g.getDescriptionOfTheRules());
        this.setGameType(g.getGameType());
        this.setNumberOfPlayers(g.getNumberOfPlayers());
        this.setPlayingEndpoint(g.getPlayingEndpoint());
    }
}
