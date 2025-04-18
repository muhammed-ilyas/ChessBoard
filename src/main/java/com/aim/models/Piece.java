package com.aim.models;

import java.util.Set;

/**
 * Piece interface represents a chess piece and provides a method to calculate its next possible moves.
 */
public interface Piece {
    Set<Cell> nextPossibleMoves(Cell currentPosition);
}
