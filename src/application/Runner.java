package application;

import model.chess.entities.ChessMatch;

public class Runner {

    public static void main(String[] args) {
        UInterface uInterface = new UInterface();
        ChessMatch chessMatch = new ChessMatch();
        uInterface.printBoard(chessMatch.getPieces());
    }


}

