package com.aviatar.rock_scissors_paper.controllers;

import com.aviatar.rock_scissors_paper.domain.model.Game;
import com.aviatar.rock_scissors_paper.domain.model.GameDescription;
import com.aviatar.rock_scissors_paper.dto.CreateGameDto;
import com.aviatar.rock_scissors_paper.dto.GameDto;
import com.aviatar.rock_scissors_paper.services.GameService;
import com.aviatar.rock_scissors_paper.services.IGameService;
import jdk.jshell.spi.ExecutionControl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/game")
public class GameController {
    @Autowired
    private IGameService gameService;
// TODO Instanciar el servicio de manera que permita jugar. 
    public GameController(GameService gameService){
        this.gameService = gameService;
    }

//    @PostMapping()
//    public ResponseEntity<GameDto> createRockPaperScissorsGame(CreateGameDto gameDto){
////        try {
////            Game game = gameService.createGame(gameDto);
////            GameDto dto = new GameDto();
////            return new ResponseEntity<>(dto, HttpStatus.OK);
////        } catch (ExecutionControl.NotImplementedException e) {
////            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
////        }

//    }
    @GetMapping
    public ResponseEntity<List<GameDescription>> getAvailableGames(){
    return new ResponseEntity<>(gameService.getGames(), HttpStatus.OK);
    }

}
