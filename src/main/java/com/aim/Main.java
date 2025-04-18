package com.aim;

import com.aim.controllers.ChessGameController;
import com.aim.enums.GameState;
import com.aim.models.ChessGame;
import com.aim.services.ChessGameService;
import com.aim.services.ChessGameServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Chess Game!");
        ChessGameService chessGameService = new ChessGameServiceImpl();
        ChessGame chessGame = new ChessGame();
        ChessGameController chessGameController =
                new ChessGameController(chessGameService, chessGame);
        chessGameController.displayBoard();
        while (chessGame.getGameState() == GameState.IN_PROGRESS) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the piece and position (e.g., Pawn, G1): ");
            System.out.println("or enter 'exit' to quit the game.");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                chessGame.setGameState(GameState.CLOSED);
                System.out.println("Exiting the game.");
                return;
            }
            String[] parts = input.split(",");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please enter in the format: Piece, Position");
            }
            try {
                String pieceType = parts[0].trim();
                String currentPosition = parts[1].trim();
                // Display the next possible moves for the given piece and position
                System.out.println("Next possible moves for " + pieceType + " at " + currentPosition + " is/are as below:");
                chessGameController.displayNextPossibleMoves(pieceType, currentPosition);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}