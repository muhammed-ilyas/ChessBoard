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

    /**
     * This method returns the next possible moves for a given chess piece at a specified position.
     * It first checks if the cell position is valid, and if not, throws an InvalidCellException.
     * Then, it retrieves the piece type and calculates the possible moves.
     * If there are no possible moves, it throws a NoPossibleMovesException.
     * Finally, it returns the set of possible moves.
     */
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

    /**
     * This method retrieves the chess piece based on the provided piece type.
     * It uses a switch statement to return the appropriate piece object.
     * If the piece type is invalid, it throws an InvalidChessPieceException.
     */
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
