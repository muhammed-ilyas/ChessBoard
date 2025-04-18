package com.aim.exceptions;

/**
 * InvalidChessPieceException is thrown when an invalid chess piece is encountered.
 */
public class InvalidChessPieceException extends RuntimeException {
    public InvalidChessPieceException(String message) {
        super(message);
    }
}
