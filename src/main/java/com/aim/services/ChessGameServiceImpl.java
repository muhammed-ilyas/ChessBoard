package com.aim.service;

import com.aim.enums.ChessPieceType;
import com.aim.models.Cell;

import java.util.List;
import java.util.Set;

public class ChessGameServiceImpl implements ChessGameService{

    @Override
    public Set<Cell> nextPossibleMoves(String pieceType, String currentPosition) {
        Piece piece = getPiece(pieceType);
        Cell currentCell = Cell.fromChessNotation(currentPosition);
        if (!currentCell.isValidCell()) {
            throw new IllegalArgumentException("Invalid cell position: " + currentPosition);
        }
        Set<Cell> possibleMoves = piece.nextPossibleMoves(currentCell);
        if (possibleMoves.isEmpty()) {
            throw new IllegalArgumentException("No possible moves for the piece "+pieceType+" at position: " + currentPosition);
        }
        return possibleMoves;
    }

    @Override
    public Piece getPiece(String pieceType) {
        return switch (ChessPieceType.fromString(pieceType)) {
            case PAWN -> new Pawn();
            case KING -> new King();
            case QUEEN -> new Queen();
            // Add other cases for different piece types
            default -> throw new IllegalArgumentException("Invalid piece type: " + pieceType);
        };
    }
}
