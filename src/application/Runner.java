package application;

import model.board.entities.Piece;
import model.chess.entities.ChessMatch;
import model.chess.entities.ChessPiece;
import model.chess.entities.ChessPosition;
import model.chess.exceptions.ChessException;

import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        List<Piece> capturedPieces = new ArrayList<>();
        while (!chessMatch.getCheckMate()) {
            try {
                UInterface.clearScreen();
                UInterface.printMatch(chessMatch, capturedPieces);
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UInterface.readChessPosition(scanner);
                boolean[][] possibleMoves = chessMatch.possibleMoves(source);
                UInterface.clearScreen();
                UInterface.printMatch(chessMatch, possibleMoves);
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UInterface.readChessPosition(scanner);
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
                if (capturedPiece != null) {
                    capturedPieces.add(capturedPiece);
                }
                if (chessMatch.getPromoted() != null) {
                    scanner.nextLine();
                    System.out.println("Enter piece for promotion (B/N/R/Q): ");
                    String type = scanner.nextLine().toUpperCase();
                    while (!type.equals("B") && !type.equals("N") && !type.equals("R") && !type.equals("Q")) {
                        System.out.println("Invalid value! Enter piece for promotion (B/N/R/Q): ");
                        type = scanner.nextLine().toUpperCase();
                    }
                        chessMatch.replacePromotedPiece(type);
                }
            } catch (ChessException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
                scanner.nextLine();
                scanner.nextLine();
            }
        }
        UInterface.clearScreen();
        UInterface.printMatch(chessMatch, capturedPieces);

    }


}

