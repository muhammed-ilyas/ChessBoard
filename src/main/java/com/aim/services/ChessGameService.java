package com.aim.service;

import com.aim.models.Cell;

import java.util.List;
import java.util.Set;

public interface ChessGameService {
    Set<Cell> nextPossibleMoves(String pieceType, String currentPosition);
    Piece getPiece(String pieceType);
}
