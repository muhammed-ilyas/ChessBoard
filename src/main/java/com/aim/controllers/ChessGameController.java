package com.aim.controller;

import com.aim.models.Cell;
import com.aim.models.ChessBoard;
import com.aim.models.ChessGame;
import com.aim.service.ChessGameService;
import com.aim.service.ChessGameServiceImpl;
import com.aim.service.Piece;

import java.util.List;
import java.util.Set;

public class ChessGameController {
    // This class will handle the chessboard logic
    // It will include methods to initialize the ChessGame, next possible moves, and display the board
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
