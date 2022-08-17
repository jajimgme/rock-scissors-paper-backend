package com.aviatar.rock_scissors_paper.domain.model;

import com.aviatar.rock_scissors_paper.domain.GameEngine;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class Game {
    public GameEngine gameRuleSet;
    public List<GamePick> gamePicks;
    public List<Player> players;

    public GameResult play(Play p){
        return gameRuleSet.play(p);
    }
}



