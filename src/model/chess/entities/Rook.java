package model.chess.entities;

import model.board.entities.Position;

public class Rook extends ChessPiece {

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
        return "R";
    }
}
