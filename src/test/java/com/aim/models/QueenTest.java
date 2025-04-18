package com.aim.models;


import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class QueenTest {

    private Queen queen;

    @Test
    void nextPossibleMoves_whenPositionedInMiddle() {
        // Initialize the Queen piece
        queen = new Queen();

        // Test the next possible moves for the Queen piece
        Cell currentPosition = Cell.fromChessNotation("E4");
        Set<Cell> possibleMoves = queen.nextPossibleMoves(currentPosition);

        // Assert that the number of possible moves is correct
        assertEquals(27, possibleMoves.size());
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("D3")));
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("E5")));
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("F4")));
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("E1")));
    }

    @Test
    void nextPossibleMoves_whenPositionedAtCorner() {
        // Initialize the Queen piece
        queen = new Queen();

        // Test the next possible moves for the Queen piece
        Cell currentPosition = Cell.fromChessNotation("A1");
        Set<Cell> possibleMoves = queen.nextPossibleMoves(currentPosition);

        // Assert that the number of possible moves is correct
        assertEquals(21, possibleMoves.size());
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("A2")));
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("B1")));
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("B2")));
    }
}