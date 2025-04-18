package com.aim.services;

import com.aim.models.Cell;

import java.util.HashSet;
import java.util.Set;

public class King implements Piece {
    private static final int[][] MOVES = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},          {0, 1},
            {1, -1}, {1, 0}, {1, 1}
    };
    @Override
    public Set<Cell> nextPossibleMoves(Cell currentPosition) {
        Set<Cell> possibleMoves = new HashSet<>();
        for (int[] move : MOVES) {
            int newRow = currentPosition.getRow() + move[0];
            int newCol = currentPosition.getColumn() + move[1];
            Cell newCell = new Cell(newRow, newCol);
            if (newCell.isValidCell()) {
                possibleMoves.add(newCell);
            }
        }
        return possibleMoves;
    }
}
