package com.aim.exceptions;

public class InvalidChessPieceException extends RuntimeException {
    public InvalidChessPieceException(String message) {
        super(message);
    }
}
