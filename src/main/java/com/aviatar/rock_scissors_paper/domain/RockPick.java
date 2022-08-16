package com.aviatar.rock_scissors_paper.domain;

import lombok.AllArgsConstructor;

import java.util.Arrays;
import java.util.HashSet;

public class RockPick  {
    private final PossiblePicksType type = PossiblePicksType.ROCK;
    private final HashSet<PossiblePicksType> Defeats = new HashSet<>(Arrays.asList(PossiblePicksType.SCISSORS));

    public boolean isPickWinner(PossiblePicksType pick){
        return Defeats.contains(pick);
    }
}
