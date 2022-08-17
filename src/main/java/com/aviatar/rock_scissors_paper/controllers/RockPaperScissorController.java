package com.aviatar.rock_scissors_paper.controllers;

import com.aviatar.rock_scissors_paper.domain.model.GameType;
import com.aviatar.rock_scissors_paper.domain.model.RockPaperScissorsGameDescription;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RockPaperScissorController {


    public ResponseEntity<RockPaperScissorsGameDescription> getGameDescription(GameType gameType){

    }
}
