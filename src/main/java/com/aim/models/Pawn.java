package com.aim.services;

import com.aim.models.Cell;

import java.util.Set;

public class Pawn implements Piece {
    @Override
    public Set<Cell> nextPossibleMoves(Cell currentPosition) {
        Cell forward = new Cell(currentPosition.getRow() + 1, currentPosition.getColumn());
        if (forward.isValidCell()) {
            return Set.of(forward);
        }
        return Set.of();
    }
}
