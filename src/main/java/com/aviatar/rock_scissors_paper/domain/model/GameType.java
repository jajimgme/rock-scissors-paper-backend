package com.aviatar.rock_scissors_paper.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GameType {
    public String name;
    public int NumberOfPlayers;
}
