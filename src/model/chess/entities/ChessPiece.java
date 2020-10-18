package model.chess.entities;

import model.board.entities.Piece;
import model.board.entities.Position;
import model.chess.entities.ChessPosition;
import model.chess.enumerations.Color;

public abstract class ChessPiece extends Piece {

    private Color color;

    private int moveCount;

    public ChessPosition getChessPosition() {
        // TODO: write the code
        return null;
    }

    protected boolean isThereOpponentPiece(Position position) {
        // TODO: write the code
        return false;
    }

    protected void increaseMoveCount() {
        // TODO: write the code
    }

    protected void decreaseMoveCount() {
        // TODO: write the code
    }
}
