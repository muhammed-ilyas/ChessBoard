package com.aim.controllers;

import com.aim.enums.GameState;
import com.aim.models.ChessGame;
import com.aim.services.ChessGameService;
import com.aim.services.ChessGameServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChessGameControllerTest {

    private ChessGameController chessGameController;
    private ChessGame chessGame;
    private ChessGameService chessGameService;

    @BeforeEach
    void setUp() {
        // Initialize the ChessGameController with a mock ChessGameService and ChessGame
        chessGameService = new ChessGameServiceImpl();
        chessGame = new ChessGame();
        chessGameController = new ChessGameController(chessGameService, chessGame);
    }

    @Test
    void displayBoard() {

        // Call the displayBoard method
        chessGameController.displayBoard();

        assertEquals(GameState.IN_PROGRESS, chessGame.getGameState());
        assertEquals(8, chessGame.getChessBoard().getRows());
        assertEquals(8, chessGame.getChessBoard().getColumns());
    }

    @Test
    void displayNextPossibleMoves() {
        // Call the displayNextPossibleMoves method with a piece type and position
        String pieceType = "Pawn";
        String currentCellPosition = "E4";

        chessGameController.displayNextPossibleMoves(pieceType, currentCellPosition);

        assertEquals(GameState.IN_PROGRESS, chessGame.getGameState());

    }
}