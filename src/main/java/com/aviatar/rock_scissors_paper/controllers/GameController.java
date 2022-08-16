package com.aviatar.rock_scissors_paper.controllers;

import com.aviatar.rock_scissors_paper.domain.Game;
import com.aviatar.rock_scissors_paper.dto.CreateGameDto;
import com.aviatar.rock_scissors_paper.dto.GameDto;
import com.aviatar.rock_scissors_paper.services.GameService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/game")
public class GameController {
    private GameService gameService;
// TODO Instanciar el servicio de manera que permita jugar. 
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

    @PostMapping()
    public ResponseEntity<GameDto> createRockPaperScissorsGame(CreateGameDto gameDto){
        try {
            Game game = gameService.createGame(gameDto);
            GameDto dto = new GameDto();
            return new ResponseEntity<>(dto, HttpStatus.OK);
        } catch (ExecutionControl.NotImplementedException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }

    }
}
