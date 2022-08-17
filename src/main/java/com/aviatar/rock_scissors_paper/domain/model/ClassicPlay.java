package com.aviatar.rock_scissors_paper.domain.model;

import lombok.Data;

@Data
public class ClassicPlay implements Play{
    public Pick player1Pick;
    public Pick player2Pick;
}
