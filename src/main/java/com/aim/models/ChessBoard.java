package com.aim.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ChessBoard {
    private final List<List<Cell>> cells;
    private final int rows;
    private final int columns;

    public ChessBoard(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.cells = initializeCells(rows, columns);
    }

    private List<List<Cell>> initializeCells(int rows, int columns) {
        List<List<Cell>> listOfCells = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            listOfCells.add(new ArrayList<>());
            for (int j = 0; j < columns; j++) {
                listOfCells.get(i).add(new Cell(i, j));
            }
        }
        return listOfCells;
    }

    public void printBoard() {
        for (int i = rows-1; i >= 0; i--) {
            for (int j = 0; j < columns; j++) {
                System.out.print("| "+cells.get(i).get(j).toChessNotation() + " | " );
            }
            System.out.println();
        }
    }
    public void printBoard(Set<Cell> possibleMoves) {
        for (int i = rows-1; i >= 0; i--) {
            for (int j = 0; j < columns; j++) {
                if (possibleMoves.contains(this.cells.get(i).get(j))) {
                    System.out.print("| " + this.cells.get(i).get(j).toChessNotation() + " | ");
                } else {
                    System.out.print("|    | ");
                }
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getCells() {
        return this.cells;
    }

    public int getRows() {
        return this.rows;
    }

    public int getColumns() {
        return this.columns;
    }
}
