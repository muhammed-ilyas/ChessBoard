package com.aim.exceptions;

/**
 * InvalidCellException is thrown when a cell is invalid in the context of a chess game.
 * This exception extends RuntimeException and is used to indicate that an operation
 * was attempted on an invalid cell.
 */
public class InvalidCellException extends RuntimeException {
    public InvalidCellException(String message) {
        super(message);
    }
}
