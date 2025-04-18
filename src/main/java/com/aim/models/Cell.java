package com.aim.models;

/***
 * Represents a cell on a chessboard.
 * The cell is defined by its row and column indices.
 * The row and column indices are zero-based.
 */
public class Cell {
    private final int row;
    private final int column;

    public Cell(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean isValidCell() {
        return row >= 0 && column >= 0 && row < 8 && column < 8;
    }

    /**
     * Converts a chess notation (like "A1", "B2") to a Cell object.
     * @param chessNotation The chess notation string.
     * @return A Cell object representing the position on the chessboard.
     */
    public static Cell fromChessNotation(String chessNotation) {
        int row = Character.getNumericValue(chessNotation.charAt(1)) - 1;
        int column = Character.toUpperCase(chessNotation.charAt(0)) - 'A';
        return new Cell(row, column);
    }

    /**
     * Converts the cell's row and column indices to chess notation (like "A1", "B2").
     * @return A string representing the cell in chess notation.
     */
    public String toChessNotation() {
        return "" + (char) ('A' + column) + (row + 1);
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cell other)) return false;
        return this.row == other.row && this.column == other.column;
    }

    @Override
    public int hashCode() {
        return 31 * row + column;
    }


}
