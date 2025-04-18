package com.aim.services;

import com.aim.models.Cell;
import com.aim.models.Piece;

import java.util.Set;

/**
 * ChessGameService interface provides methods to interact with the chess game.
 * It allows for retrieving possible moves for a given piece and getting the piece object itself.
 */
public interface ChessGameService {

    Set<Cell> nextPossibleMoves(String pieceType, String currentPosition);

    Piece getPiece(String pieceType);
}
