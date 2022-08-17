package com.aviatar.rock_scissors_paper.domain.game_implementations;

import com.aviatar.rock_scissors_paper.domain.model.GamePick;
import com.aviatar.rock_scissors_paper.domain.model.PossiblePicksType;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
@Service
public class RockPaperScissorsClassicPicksFactory implements GamePickFactoryProvider {
    @Override
    public List<GamePick> createGamePicks() {
        List<GamePick> possibleGamePicks = Arrays.asList(createPaper(), createRock(), createScissors());
        return possibleGamePicks;
    }

    public GamePick createRock() {
        return createPick(PossiblePicksType.ROCK, Arrays.asList(PossiblePicksType.SCISSORS));
    }

    public GamePick createPaper() {
        return createPick(PossiblePicksType.PAPER, Arrays.asList(PossiblePicksType.ROCK));
    }

    public GamePick createScissors() {
        return createPick(PossiblePicksType.SCISSORS, Arrays.asList(PossiblePicksType.PAPER));
    }


    public GamePick createPick(PossiblePicksType type, List<PossiblePicksType> defeatTypes) {
        return new GamePick(type, new HashSet<>(defeatTypes));
    }

}
