package com.aviatar.rock_scissors_paper.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;

@AllArgsConstructor
@Data
public class GamePick {
    private PossiblePicksType type;
    private final HashSet<PossiblePicksType> defeats;

    public boolean defeats(PossiblePicksType pick) {
        return defeats.contains(pick);
    }


}
