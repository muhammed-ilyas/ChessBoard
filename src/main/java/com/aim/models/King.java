package com.aim.models;

import java.util.HashSet;
import java.util.Set;

public class King implements Piece {
    /***
     * The King can move one square in any direction (horizontally, vertically, or diagonally).
     * This means it can move to any of the 8 surrounding squares.
     */
    private static final int[][] MOVES = {
            {-1, -1}, {-1, 0}, {-1, 1},
            {0, -1},          {0, 1},
            {1, -1}, {1, 0}, {1, 1}
    };

    /**
     * This method calculates the next possible moves for the King piece.
     * It checks all 8 possible directions and adds valid cells to the set of possible moves.
     *
     * @param currentPosition The current position of the King on the board.
     * @return A set of cells representing the next possible moves for the King.
     */
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
