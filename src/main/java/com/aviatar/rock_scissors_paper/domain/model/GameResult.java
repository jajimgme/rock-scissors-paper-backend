package com.aviatar.rock_scissors_paper.domain.model;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
public class GameResult {
    @NonNull
    public GameResultTypes gameResultType;
    public Player winner = null;
}
