package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Piece;
import model.board.entities.Position;
import model.chess.enumerations.Color;
import model.chess.exceptions.ChessException;

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
        Position position = sourcePosition.toPosition();
        validateSourcePosition(position);
        return this.board.piece(position).possibleMoves();
    }

    private void validateSourcePosition(Position position) {
        if (!this.board.thereIsAPiece(position)) {
            throw new ChessException("There is no piece on source position.");
        } else if (!this.board.piece(position).isThereAnyPossibleMove()) {
            throw new ChessException("There is no possible moves for the chosen piece");
        }
    }

    private void validateTargetPosition(Position source,Position target) {
        if (!this.board.piece(source).posssibleMove(target)) {
            throw new ChessException("The chosen piece can't move to target position");
        }
    }

    private Piece makeMove(Position sourcePosition, Position targetPosition) {
        Piece piece = this.board.removePiece(sourcePosition);
        Piece capturedPiece = this.board.removePiece(targetPosition);
        this.board.placePiece(piece, targetPosition);
        return capturedPiece;
    }

    public ChessPiece performChessMove(ChessPosition sourcePosition, ChessPosition targetPosition) {
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        validateTargetPosition(source, target);
        return (ChessPiece) makeMove(source, target);
    }

    public ChessPiece replacePromotedPiece(String type) {
        return null;
    }

    private void placeNewPiece(char column, int row, ChessPiece piece) {
        this.board.placePiece(piece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup() {
        // White pieces
        placeNewPiece('a', 1, new Rook(Color.WHITE, this.board));
        placeNewPiece('b', 1, new Knight(Color.WHITE, this.board));
        placeNewPiece('c', 1, new Bishop(Color.WHITE, this.board));
        placeNewPiece('d', 1, new Queen(Color.WHITE, this.board));
        placeNewPiece('e', 1, new King(Color.WHITE, this.board));
        placeNewPiece('f', 1, new Bishop(Color.WHITE, this.board));
        placeNewPiece('g', 1, new Knight(Color.WHITE, this.board));
        placeNewPiece('h', 1, new Rook(Color.WHITE, this.board));
//        placeNewPiece('a', 2, new Pawn(Color.WHITE, this.board));
        placeNewPiece('b', 2, new Pawn(Color.WHITE, this.board));
        placeNewPiece('c', 2, new Pawn(Color.WHITE, this.board));
        placeNewPiece('d', 2, new Pawn(Color.WHITE, this.board));
        placeNewPiece('e', 2, new Pawn(Color.WHITE, this.board));
        placeNewPiece('f', 2, new Pawn(Color.WHITE, this.board));
        placeNewPiece('g', 2, new Pawn(Color.WHITE, this.board));
        placeNewPiece('h', 2, new Pawn(Color.WHITE, this.board));
        // Black pieces
        placeNewPiece('a', 8, new Rook(Color.BLACK, this.board));
        placeNewPiece('b', 8, new Knight(Color.BLACK, this.board));
        placeNewPiece('c', 8, new Bishop(Color.BLACK, this.board));
        placeNewPiece('d', 8, new Queen(Color.BLACK, this.board));
        placeNewPiece('e', 8, new King(Color.BLACK, this.board));
        placeNewPiece('f', 8, new Bishop(Color.BLACK, this.board));
        placeNewPiece('g', 8, new Knight(Color.BLACK, this.board));
        placeNewPiece('h', 8, new Rook(Color.BLACK, this.board));
        placeNewPiece('a', 7, new Pawn(Color.BLACK, this.board));
        placeNewPiece('b', 7, new Pawn(Color.BLACK, this.board));
        placeNewPiece('c', 7, new Pawn(Color.BLACK, this.board));
        placeNewPiece('d', 7, new Pawn(Color.BLACK, this.board));
        placeNewPiece('e', 7, new Pawn(Color.BLACK, this.board));
        placeNewPiece('f', 7, new Pawn(Color.BLACK, this.board));
        placeNewPiece('g', 7, new Pawn(Color.BLACK, this.board));
        placeNewPiece('h', 7, new Pawn(Color.BLACK, this.board));
    }

}
