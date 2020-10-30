package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Position;
import model.chess.enumerations.Color;

public class Rook extends ChessPiece {

    public Rook(Color color, Board board) {
        super(color, board);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position position = new Position(0, 0);
        // above
        position.setValue(super.position.getRow() - 1, super.position.getColumn());
        while (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
            position.setRow(position.getRow() - 1);
        }
        if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // left
        position.setValue(super.position.getRow(), super.position.getColumn() - 1);
        while (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
            position.setColumn(position.getColumn() - 1);
        }
        if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }// right
        position.setValue(super.position.getRow(), super.position.getColumn() + 1);
        while (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
            position.setColumn(position.getColumn() + 1);
        }
        if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // below
        position.setValue(super.position.getRow() + 1, super.position.getColumn());
        while (getBoard().positionExists(position) && !getBoard().thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
            position.setRow(position.getRow() + 1);
        }
        if (getBoard().positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        return possibleMoves;
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
