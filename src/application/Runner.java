package application;

import model.board.entities.Position;
import model.chess.entities.ChessMatch;
import model.chess.entities.ChessPiece;
import model.chess.entities.ChessPosition;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChessMatch chessMatch = new ChessMatch();
        while (true) {
            UInterface.clearScreen();
            UInterface.printBoard(chessMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            ChessPosition source = UInterface.readChessPosition(scanner);
            System.out.println();
            System.out.print("Target: ");
            ChessPosition target = UInterface.readChessPosition(scanner);
            ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
        }

    }


}

