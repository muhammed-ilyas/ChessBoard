package com.aim.models;

import com.aim.enums.GameState;

/***
 * ChessGame class represents a chess game.
 * It contains a chessboard and the current game state.
 */
public class ChessGame {
    private final ChessBoard chessBoard;
    private GameState gameState;
    public ChessGame() {
        // assuming chessboard will always be 8x8
        this.chessBoard = new ChessBoard(8, 8);
        this.gameState = GameState.IN_PROGRESS;
    }
    public ChessBoard getChessBoard() {
        return chessBoard;
    }
    public GameState getGameState() {
        return gameState;
    }
    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
