package com.aim.services;

import com.aim.models.Cell;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PawnTest {

    private Pawn pawn;

    @Test
    void nextPossibleMoves_whenPositionedInMiddle() {
        // Initialize the Pawn piece
        pawn = new Pawn();

        // Test the next possible moves for the Pawn piece
        Cell currentPosition = Cell.fromChessNotation("E4");
        Set<Cell> possibleMoves = pawn.nextPossibleMoves(currentPosition);

        // Assert that the number of possible moves is correct
        assertEquals(1, possibleMoves.size());
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("E5")));
    }

    @Test
    void nextPossibleMoves_whenNoMovesPossible() {
        // Initialize the Pawn piece
        pawn = new Pawn();

        // Test the next possible moves for the Pawn piece
        Cell currentPosition = Cell.fromChessNotation("A8");
        Set<Cell> possibleMoves = pawn.nextPossibleMoves(currentPosition);

        // Assert that the number of possible moves is correct
        assertEquals(0, possibleMoves.size());
    }

}