package com.aim.services;

import com.aim.enums.ChessPieceType;
import com.aim.exceptions.InvalidCellException;
import com.aim.exceptions.InvalidChessPieceException;
import com.aim.exceptions.NoPossibleMovesException;
import com.aim.models.Cell;
import com.aim.models.King;
import com.aim.models.Pawn;
import com.aim.models.Piece;
import com.aim.models.Queen;

import java.util.Set;

public class ChessGameServiceImpl implements ChessGameService{

    @Override
    public Set<Cell> nextPossibleMoves(String pieceType, String currentPosition) {
        Piece piece = getPiece(pieceType);
        Cell currentCell = Cell.fromChessNotation(currentPosition);
        if (!currentCell.isValidCell()) {
            throw new InvalidCellException("Invalid cell position: " + currentPosition);
        }
        Set<Cell> possibleMoves = piece.nextPossibleMoves(currentCell);
        if (possibleMoves.isEmpty()) {
            throw new NoPossibleMovesException("No possible moves for the piece "+pieceType+" at position: " + currentPosition);
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
            default -> throw new InvalidChessPieceException("Invalid piece type: " + pieceType);
        };
    }
}
