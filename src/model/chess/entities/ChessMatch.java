package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Position;
import model.chess.enumerations.Color;

public class ChessMatch {

    private int turn;

    private Color currentPlayer;

    private boolean check;

    private boolean checkMate;

    private ChessPiece enPassantVulnerable;

    private ChessPiece promoted;

    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] chessPiece = new ChessPiece[this.board.getRows()][this.board.getColumns()];
        for (int i = 0; i < this.board.getRows(); i ++){
            for (int j = 0; j < this.board.getColumns(); j ++){
                chessPiece[i][j] = (ChessPiece) this.board.piece(i, j);
            }
        }
        return chessPiece;
    }

    public boolean[][] possibleMoves(ChessPosition sourcePosition) {
        return null;
    }

    public ChessPosition performChessMove(ChessPosition source, ChessPosition targetPosition) {
        return null;
    }

    public ChessPiece replacePromotedPiece(String type) {
        return null;
    }

    private void initialSetup() {
        board.placePiece(new Rook(Color.WHITE, this.board), new Position(0, 0));
        board.placePiece(new King(Color.BLACK, this.board), new Position(7, 3));
        board.placePiece(new Rook(Color.WHITE, this.board), new Position(0, 0));
    }
}
