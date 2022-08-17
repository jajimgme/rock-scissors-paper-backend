package com.aviatar.rock_scissors_paper.domain.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Pick {
    private Player Player;
    private GamePick Pick;
}
