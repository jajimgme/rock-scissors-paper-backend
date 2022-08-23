package com.test.rock_scissors_paper.dto;

import com.test.rock_scissors_paper.domain.model.GameType;
import com.test.rock_scissors_paper.domain.model.Player;
import lombok.Data;

import java.util.List;

@Data
public class CreateGameDto {
    public GameType gameType;
    public List<Player> playerList;

}


