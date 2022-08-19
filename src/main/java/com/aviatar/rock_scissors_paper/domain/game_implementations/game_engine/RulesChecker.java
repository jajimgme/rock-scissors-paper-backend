package com.aviatar.rock_scissors_paper.domain.game_implementations.game_engine;

import com.aviatar.rock_scissors_paper.domain.model.GamePick;
import com.aviatar.rock_scissors_paper.domain.model.PossiblePicksType;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RulesChecker {

    private final Map<PossiblePicksType, HashSet<PossiblePicksType>> possiblePicksRules;

    public RulesChecker(List<GamePick> possiblePicks){
        possiblePicksRules = possiblePicks.stream().collect(Collectors.toMap(GamePick::getType, g -> g.getDefeats()));

    }
    public boolean defeats(PossiblePicksType pick, PossiblePicksType pick2) {
        if(!possiblePicksRules.containsKey(pick)){
            throw new RuntimeException("That pick is not possible in this game!");
        }

        HashSet<PossiblePicksType> possiblePicksTypes = possiblePicksRules.get(pick);
        return possiblePicksTypes.contains(pick2);
    }
    
}
