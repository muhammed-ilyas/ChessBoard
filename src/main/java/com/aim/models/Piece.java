package com.aim.models;

import java.util.Set;

public interface Piece {
    Set<Cell> nextPossibleMoves(Cell currentPosition);
}
