package com.aim.enums;

public enum ChessPieceType {
    KING("King"),
    QUEEN("Queen"),
    ROOK("Rook"),
    BISHOP("Bishop"),
    KNIGHT("Knight"),
    PAWN("Pawn");

    private final String name;
    ChessPieceType(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static ChessPieceType fromString(String name) {
        for (ChessPieceType type : ChessPieceType.values()) {
            if (type.getName().equalsIgnoreCase(name)) {
                return type;
            }
        }
        throw new IllegalArgumentException("No enum constant with name " + name);
    }
}
