package com.aim.models;

public class Game {
    private ChessBoard chessBoard;
    public Game() {
        // assuming a chessboard will always be 8x8
        this.chessBoard = new ChessBoard(8, 8);
    }
    public ChessBoard getChessBoard() {
        return chessBoard;
    }
}
