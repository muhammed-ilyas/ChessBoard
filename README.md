# Chess Game Application

This is a console-based Chess Game application implemented in Java. The application allows users to input a chess piece and its position, and it calculates and displays the next possible moves for the given piece.

## Features

- Supports chess pieces like **Pawn**, **King**, and **Queen** (extendable to other pieces).
- Validates user input for piece type and position.
- Displays the chessboard and possible moves.
- Handles invalid inputs gracefully with custom exceptions.
- Modular design with services, models, and controllers.

## Project Structure

The project follows a modular structure:

- **`com.aim.models`**: Contains chess piece models like `Queen`, `King`, and `Pawn`.
- **`com.aim.services`**: Contains the service layer for calculating possible moves.
- **`com.aim.controllers`**: Manages user interaction and game flow.
- **`com.aim.enums`**: Defines enums like `GameState` and `ChessPieceType`.
- **`com.aim.exceptions`**: Custom exceptions for invalid inputs and game logic errors.
- **`com.aim`**: Entry point of the application (`Main.java`).

## Prerequisites

- **Java 17** or higher
- **Maven 3.8** or higher

## How to Run

1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-folder>

2. Compile the project:
    ```bash
    mvn clean compile
    ```
3. Run the application:
    ```bash
    mvn exec:java
    ```

## Example Usage
1. Start the application.
2. Enter a chess piece and position in the format: Piece, Position (e.g., Queen, D4).
3. The application will display the next possible moves for the given piece.

### Sample Input
```Queen, D4```
### Sample Output
```Next possible moves for Queen at D4 is/are as below:
|    | |    | |    | | D8 | |    | |    | |    | | H8 | 
| A7 | |    | |    | | D7 | |    | |    | | G7 | |    | 
|    | | B6 | |    | | D6 | |    | | F6 | |    | |    | 
|    | |    | | C5 | | D5 | | E5 | |    | |    | |    | 
| A4 | | B4 | | C4 | |    | | E4 | | F4 | | G4 | | H4 | 
|    | |    | | C3 | | D3 | | E3 | |    | |    | |    | 
|    | | B2 | |    | | D2 | |    | | F2 | |    | |    | 
| A1 | |    | |    | | D1 | |    | |    | | G1 | |    | 
```
## Extending the Application
To add support for new chess pieces:
1. Implement the Piece interface in a new class.
2. Define the movement logic in the nextPossibleMoves method.
3. Update the ChessGameServiceImpl class to include the new piece.

## Technologies Used
1. Java: Programming language.
2. Maven: Build and dependency management tool.
3. JUnit: Testing framework for unit tests.