package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.game_implementations.game_picks.RockPaperScissorsClassicPicksFactory;
import com.aviatar.rock_scissors_paper.domain.model.GameDescription;
import com.aviatar.rock_scissors_paper.domain.model.GameType;
import com.aviatar.rock_scissors_paper.domain.model.RockPaperScissorsGameDescription;
import com.aviatar.rock_scissors_paper.repository.GameRepository;

public class RockPaperScissorsGameService extends GameService {
    private RockPaperScissorsClassicPicksFactory rockPaperScissorsClassicPicksFactory;

    public RockPaperScissorsGameService(GameRepository gameRepository, RockPaperScissorsClassicPicksFactory rockPaperScissorsClassicPicksFactory) {
        super(gameRepository);
        this.rockPaperScissorsClassicPicksFactory = rockPaperScissorsClassicPicksFactory;
    }
    @Override
    public RockPaperScissorsGameDescription getDescriptionOfGameType(GameType gameType){
       GameDescription basicDescription = super.getDescriptionOfGameType(gameType);
       RockPaperScissorsGameDescription detailed = new RockPaperScissorsGameDescription(basicDescription);
       detailed.setAvailablePicks(rockPaperScissorsClassicPicksFactory.createGamePicks());
       return detailed;

    }
}
