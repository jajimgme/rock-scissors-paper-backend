package com.aviatar.rock_scissors_paper.controllers;

import com.aviatar.rock_scissors_paper.domain.model.*;
import com.aviatar.rock_scissors_paper.services.GameService;
import com.aviatar.rock_scissors_paper.services.RockPaperScissorsGameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/rock-paper-scissor")
public class RockPaperScissorController {

    private RockPaperScissorsGameService gameService;

    public RockPaperScissorController(RockPaperScissorsGameService gameService){
        this.gameService = gameService;
    }
    @GetMapping("/getGameDescription")
    public ResponseEntity<RockPaperScissorsGameDescription> getGameDescription(GameType gameType){
        return new ResponseEntity<>(gameService.getDescriptionOfGameType(gameType), HttpStatus.OK);
    }

    @PostMapping("/play")
    public ResponseEntity<GameResult> play(Play p){
        return new ResponseEntity<>(gameService.playGame(p), HttpStatus.OK);
    }

    @PostMapping("/getAIPick")
    public ResponseEntity<GamePick> getAIPick(GameType type){
        return new ResponseEntity<>(gameService.getAIGamePick(), HttpStatus.OK);
    }
}
