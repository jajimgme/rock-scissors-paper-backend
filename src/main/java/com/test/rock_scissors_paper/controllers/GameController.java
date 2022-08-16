package com.test.rock_scissors_paper.controllers;

import com.test.rock_scissors_paper.domain.model.GameDescription;
import com.test.rock_scissors_paper.services.GameService;
import com.test.rock_scissors_paper.services.IGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping(value = "/game", produces = {"application/json"})
public class GameController {
    @Autowired
    private IGameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public ResponseEntity<List<GameDescription>> getAvailableGames() {
        return new ResponseEntity<>(gameService.getGames(), HttpStatus.OK);
    }

}
