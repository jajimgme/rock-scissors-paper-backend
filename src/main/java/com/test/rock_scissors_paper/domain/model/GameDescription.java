package com.test.rock_scissors_paper.domain.model;

import lombok.Data;

@Data
public class GameDescription {
    private int numberOfPlayers;
    private String descriptionOfTheRules;
    private GameType gameType;
    private String playingEndpoint;

}
