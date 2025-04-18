package com.aim.services;

import com.aim.models.Cell;
import com.aim.models.Pawn;
import com.aim.models.Piece;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ChessGameServiceImplTest {

    private ChessGameServiceImpl chessGameService;

    @BeforeEach
    void setUp() {
        chessGameService = new ChessGameServiceImpl();
    }

    @Test
    void nextPossibleMoves() {
        // Test the next possible moves for a piece
        Set<Cell> possibleMoves = chessGameService.nextPossibleMoves("Pawn","E4");
        // Assert that the number of possible moves is correct
        assertNotNull(possibleMoves);
    }

    @Test
    void getPiece() {
        // Test the getPiece method
        Piece piece = chessGameService.getPiece("Pawn");
        assertNotNull(piece);
        assertEquals(Pawn.class, piece.getClass());
    }
}