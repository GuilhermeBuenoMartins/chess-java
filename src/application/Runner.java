package application;

import model.chess.entities.ChessMatch;
import model.chess.entities.ChessPiece;
import model.chess.entities.ChessPosition;
import model.chess.exceptions.ChessException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            try {
                UInterface.clearScreen();
                UInterface.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                ChessPosition source = UInterface.readChessPosition(scanner);
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UInterface.readChessPosition(scanner);
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
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

    }


}

