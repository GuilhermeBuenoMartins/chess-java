package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Piece;
import model.board.entities.Position;
import model.chess.enumerations.Color;

public abstract class ChessPiece extends Piece {

    private Color color;

    private int moveCount;

    public ChessPiece(Color color, Board board) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public ChessPosition getChessPosition() {
        return ChessPosition.fromPosition(super.position);
    }

    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece piece = (ChessPiece) this.board.piece(position);
        return (piece != null) && (piece.getColor() != this.color);
    }

    protected void increaseMoveCount() {
        // TODO: write the code
    }

    protected void decreaseMoveCount() {
        // TODO: write the code
    }
}
