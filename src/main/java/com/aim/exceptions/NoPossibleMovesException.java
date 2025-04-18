package com.aim.exceptions;

public class NoPossibleMovesException extends RuntimeException {
    public NoPossibleMovesException(String message) {
        super(message);
    }
}
