package com.aviatar.rock_scissors_paper.services;

import com.aviatar.rock_scissors_paper.domain.GameEngine;
import com.aviatar.rock_scissors_paper.domain.game_implementations.ai.GameAI;
import com.aviatar.rock_scissors_paper.domain.game_implementations.ai.RockPaperScissorsAI;
import com.aviatar.rock_scissors_paper.domain.game_implementations.game_engine.TwoPlayersGameRulesEngine;
import com.aviatar.rock_scissors_paper.domain.game_implementations.game_picks.RockPaperScissorsClassicPicksFactory;
import com.aviatar.rock_scissors_paper.domain.model.*;
import com.aviatar.rock_scissors_paper.repository.GameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RockPaperScissorsGameService extends GameService {
    private final GameAI rockPaperScissorsAI;
    private RockPaperScissorsClassicPicksFactory rockPaperScissorsClassicPicksFactory;

    public RockPaperScissorsGameService(GameRepository gameRepository, RockPaperScissorsClassicPicksFactory rockPaperScissorsClassicPicksFactory) {
        super(gameRepository, null);
        this.rockPaperScissorsClassicPicksFactory = rockPaperScissorsClassicPicksFactory;
        List<GamePick> gamePicks = this.rockPaperScissorsClassicPicksFactory.getGamePicks();
        rockPaperScissorsAI = new RockPaperScissorsAI(gamePicks);
        GameEngine gameEngine = new TwoPlayersGameRulesEngine(gamePicks);
        super.setGameEngine(gameEngine);



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
