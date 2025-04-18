package com.aim.services;

import com.aim.models.Cell;
import com.aim.models.Piece;

import java.util.Set;

public interface ChessGameService {

    Set<Cell> nextPossibleMoves(String pieceType, String currentPosition);

    Piece getPiece(String pieceType);
}
