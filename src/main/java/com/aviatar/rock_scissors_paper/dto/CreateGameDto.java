package com.aviatar.rock_scissors_paper.dto;

import com.aviatar.rock_scissors_paper.domain.model.Player;
import com.aviatar.rock_scissors_paper.domain.model.GameType;
import lombok.Data;

import java.util.List;

@Data
public class CreateGameDto {
    public GameType gameType;
    public List<Player> playerList;

}


