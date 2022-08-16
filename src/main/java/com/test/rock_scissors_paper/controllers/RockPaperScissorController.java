package com.test.rock_scissors_paper.controllers;

import com.test.rock_scissors_paper.domain.model.*;
import com.test.rock_scissors_paper.services.RockPaperScissorsGameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping(value = "/rock-paper-scissor", produces = {"application/json"})
public class RockPaperScissorController {

    private final RockPaperScissorsGameService gameService;

    public RockPaperScissorController(RockPaperScissorsGameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/getGameDescription")
    public ResponseEntity<RockPaperScissorsGameDescription> getGameDescription(GameType gameType) {
        return new ResponseEntity<>(gameService.getDescriptionOfGameType(gameType), HttpStatus.OK);
    }

    @PostMapping("/play")
    public ResponseEntity<GameResult> play(@RequestBody Play p) {
        return new ResponseEntity<>(gameService.playGame(p), HttpStatus.OK);
    }

    @GetMapping("/getAIPick")
    public ResponseEntity<GamePick> getAIPick(GameType type) {
        return new ResponseEntity<>(gameService.getAIGamePick(), HttpStatus.OK);
    }
}
