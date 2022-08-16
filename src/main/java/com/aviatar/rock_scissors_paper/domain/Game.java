package com.aviatar.rock_scissors_paper.domain;

import com.aviatar.rock_scissors_paper.services.GameRuleSet;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Data
public class Game {
    public GameRuleSet gameRuleSet;
    public List<GamePick> gamePicks;
    public List<Player> players;
}



