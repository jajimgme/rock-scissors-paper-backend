package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.GameEngine;
import com.aviatar.rock_scissors_paper.domain.game_implementations.ai.GameAI;
import com.aviatar.rock_scissors_paper.domain.game_implementations.ai.RockPaperScissorsAI;
import com.aviatar.rock_scissors_paper.domain.game_implementations.game_picks.RockPaperScissorsClassicPicksFactory;
import com.aviatar.rock_scissors_paper.domain.model.*;
import com.aviatar.rock_scissors_paper.repository.GameRepository;
import org.springframework.stereotype.Service;

@Service
public class RockPaperScissorsGameService extends GameService {
    private final GameAI rockPaperScissorsAI;
    private RockPaperScissorsClassicPicksFactory rockPaperScissorsClassicPicksFactory;

    public RockPaperScissorsGameService(GameRepository gameRepository, RockPaperScissorsClassicPicksFactory rockPaperScissorsClassicPicksFactory, GameEngine gameEngine) {
        super(gameRepository, gameEngine);
        this.rockPaperScissorsClassicPicksFactory = rockPaperScissorsClassicPicksFactory;
        rockPaperScissorsAI = new RockPaperScissorsAI(this.rockPaperScissorsClassicPicksFactory.getGamePicks());

    }
    @Override
    public RockPaperScissorsGameDescription getDescriptionOfGameType(GameType gameType){
       GameDescription basicDescription = super.getDescriptionOfGameType(gameType);
       RockPaperScissorsGameDescription detailed = new RockPaperScissorsGameDescription(basicDescription);
       detailed.setAvailablePicks(rockPaperScissorsClassicPicksFactory.getGamePicks());
       return detailed;

    }

    public GamePick getAIGamePick(){
        return rockPaperScissorsAI.generatePick();
    }


}
