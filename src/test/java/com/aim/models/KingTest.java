package com.aim.models;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KingTest {

    private King king;

    @Test
    void nextPossibleMoves_whenPositionedInMiddle() {
        // Initialize the King piece
        king = new King();

        // Test the next possible moves for the King piece
        Cell currentPosition = Cell.fromChessNotation("E4");
        Set<Cell> possibleMoves = king.nextPossibleMoves(currentPosition);

        // Assert that the number of possible moves is correct
        assertEquals(8, possibleMoves.size());
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("D3")));
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("E5")));
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("F4")));
    }
    @Test
    void nextPossibleMoves_whenPositionedAtCorner() {
        // Initialize the King piece
        king = new King();

        // Test the next possible moves for the King piece
        Cell currentPosition = Cell.fromChessNotation("A1");
        Set<Cell> possibleMoves = king.nextPossibleMoves(currentPosition);

        // Assert that the number of possible moves is correct
        assertEquals(3, possibleMoves.size());
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("A2")));
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("B1")));
        assertTrue(possibleMoves.contains(Cell.fromChessNotation("B2")));
    }
}