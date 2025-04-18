package com.aim.models;

import java.util.Set;

public class Pawn implements Piece {
    /**
     * Returns the next possible moves for a pawn piece.
     * The pawn can move one cell forward in the same column.
     * @param currentPosition The current position of the pawn on the chessboard.
     * @return A set of cells representing the next possible moves for the pawn.
     */
    @Override
    public Set<Cell> nextPossibleMoves(Cell currentPosition) {
        Cell forward = new Cell(currentPosition.getRow() + 1, currentPosition.getColumn());
        if (forward.isValidCell()) {
            return Set.of(forward);
        }
        return Set.of();
    }
}
