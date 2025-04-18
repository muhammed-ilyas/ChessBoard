package com.aim.services;

import com.aim.models.Cell;

import java.util.Set;

public interface Piece {
    Set<Cell> nextPossibleMoves(Cell currentPosition);
}
