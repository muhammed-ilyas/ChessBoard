package com.aim.controllers;

import com.aim.models.Cell;
import com.aim.models.ChessGame;
import com.aim.services.ChessGameService;

import java.util.Set;

public class ChessGameController {

    private final ChessGameService chessGameService;
    private final ChessGame chessGame;

    public ChessGameController(ChessGameService chessGameService, ChessGame chessGame) {
        this.chessGameService = chessGameService;
        this.chessGame = chessGame;
    }

    public void displayBoard() {
        // Logic to display the chessboard
        this.chessGame.getChessBoard().printBoard();
    }

    public void displayNextPossibleMoves(String pieceType, String currentCellPosition) {
        Set<Cell> nextPossibleMoves = chessGameService.nextPossibleMoves(pieceType, currentCellPosition);
        this.chessGame.getChessBoard().printBoard(nextPossibleMoves);
    }
}
