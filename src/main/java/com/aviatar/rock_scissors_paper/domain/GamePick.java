package com.aviatar.rock_scissors_paper.domain;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;

@AllArgsConstructor
public class GamePick {
    public PossiblePicksType type;
    private final HashSet<PossiblePicksType> defeats;

    public boolean defeats(PossiblePicksType pick) {
        return defeats.contains(pick);
    }


}
