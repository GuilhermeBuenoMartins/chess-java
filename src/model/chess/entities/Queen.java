package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Position;
import model.chess.enumerations.Color;

public class Queen extends ChessPiece {

    public Queen(Color color, Board board) {
        super(color, board);
    }

    @Override
    public boolean[][] possibleMoves() {
        return new boolean[0][];
    }

    @Override
    public ChessPosition getChessPosition() {
        return super.getChessPosition();
    }

    @Override
    protected boolean isThereOpponentPiece(Position position) {
        return super.isThereOpponentPiece(position);
    }

    @Override
    protected void increaseMoveCount() {
        super.increaseMoveCount();
    }

    @Override
    protected void decreaseMoveCount() {
        super.decreaseMoveCount();
    }

    @Override
    public String toString() {
        return "Q";
    }
}
