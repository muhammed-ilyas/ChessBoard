package com.aim.exceptions;

/**
 * NoPossibleMovesException is thrown when there are no possible moves available for a chess piece.
 * This exception extends RuntimeException and is used to indicate that a piece cannot move to any valid position.
 */
public class NoPossibleMovesException extends RuntimeException {
    public NoPossibleMovesException(String message) {
        super(message);
    }
}
