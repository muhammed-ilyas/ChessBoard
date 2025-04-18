package com.aim.models;

import java.util.HashSet;
import java.util.Set;

public class Queen implements Piece {
    private static final int[][] MOVES = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},          {0, 1},
            {1, -1}, {1, 0}, {1, 1}
    };
    @Override
    public Set<Cell> nextPossibleMoves(Cell currentPosition) {
        Set<Cell> possibleMoves = new HashSet<>();
        for(int[] move : MOVES) {
            int newRow = currentPosition.getRow() + move[0];
            int newCol = currentPosition.getColumn() + move[1];
            while (newRow >= 0 && newRow < 8 && newCol >= 0 && newCol < 8) {
                Cell newCell = new Cell(newRow, newCol);
                possibleMoves.add(newCell);
                // Assuming the queen can move indefinitely in one direction until blocked
                newRow += move[0];
                newCol += move[1];
            }
        }
        return possibleMoves;
    }
}
