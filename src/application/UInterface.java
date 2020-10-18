package application;

import model.board.entities.Piece;

public class UInterface {

    public static void printPiece(Piece piece) {
        if (piece == null) {
            System.out.print("-");
        } else {
            System.out.print(piece);
        }
        System.out.print(" ");
    }

    public static void printBoard(Piece[][] pieces) {
        for (int i = 0; i < pieces.length; i++) {
            System.out.printf("%d  ", 8 - i);
            for (Piece piece : pieces[i]) {
                printPiece(piece);
            }
            System.out.println();
        }
        System.out.println("   a b c d e f g h");
    }
}
