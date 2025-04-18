package com.aim.controllers;

import com.aim.models.Cell;
import com.aim.models.ChessGame;
import com.aim.services.ChessGameService;

import java.util.Set;

/**
 * ChessGameController class handles the interaction between the user and the chess game.
 * It provides methods to display the chessboard and the next possible moves for a given piece.
 */
public class ChessGameController {

    private final ChessGameService chessGameService;
    private final ChessGame chessGame;

    public ChessGameController(ChessGameService chessGameService, ChessGame chessGame) {
        this.chessGameService = chessGameService;
        this.chessGame = chessGame;
    }

    /**
     * Displays the current state of the chessboard.
     */
    public void displayBoard() {
        // Logic to display the chessboard
        this.chessGame.getChessBoard().printBoard();
    }

    /**
     * Displays the next possible moves for a given piece type and its current position.
     *
     * @param pieceType          The type of the chess piece (e.g., "King", "Pawn").
     * @param currentCellPosition The current position of the piece on the chessboard.
     */
    public void displayNextPossibleMoves(String pieceType, String currentCellPosition) {
        Set<Cell> nextPossibleMoves = chessGameService.nextPossibleMoves(pieceType, currentCellPosition);
        this.chessGame.getChessBoard().printBoard(nextPossibleMoves);
    }
}
