package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Position;
import model.chess.enumerations.Color;

public class Knight extends ChessPiece {

    public Knight(Color color, Board board) {
        super(color, board);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] possiblesMoves = new boolean[this.board.getRows()][this.board.getColumns()];
        Position position = new Position(this.position.getRow(), this.position.getColumn());
        position.setValue(this.position.getRow() - 2, this.position.getColumn() - 1);
        if (this.board.positionExists(position) && (!this.board.thereIsAPiece(position) || super.isThereOpponentPiece(position))) {
            possiblesMoves[position.getRow()][position.getColumn()] = true;
        }
        position.setValue(this.position.getRow() - 2, this.position.getColumn() + 1);
        if (this.board.positionExists(position) && (!this.board.thereIsAPiece(position) || super.isThereOpponentPiece(position))) {
            possiblesMoves[position.getRow()][position.getColumn()] = true;
        }
        position.setValue(this.position.getRow() - 1, this.position.getColumn() + 2);
        if (this.board.positionExists(position) && (!this.board.thereIsAPiece(position) || super.isThereOpponentPiece(position))) {
            possiblesMoves[position.getRow()][position.getColumn()] = true;
        }
        position.setValue(this.position.getRow() - 1, this.position.getColumn() - 2);
        if (this.board.positionExists(position) && (!this.board.thereIsAPiece(position) || super.isThereOpponentPiece(position))) {
            possiblesMoves[position.getRow()][position.getColumn()] = true;
        }
        position.setValue(this.position.getRow() + 1, this.position.getColumn() + 2);
        if (this.board.positionExists(position) && (!this.board.thereIsAPiece(position) || super.isThereOpponentPiece(position))) {
            possiblesMoves[position.getRow()][position.getColumn()] = true;
        }
        position.setValue(this.position.getRow() + 1, this.position.getColumn() - 2);
        if (this.board.positionExists(position) && (!this.board.thereIsAPiece(position) || super.isThereOpponentPiece(position))) {
            possiblesMoves[position.getRow()][position.getColumn()] = true;
        }
        position.setValue(this.position.getRow() + 2, this.position.getColumn() - 1);
        if (this.board.positionExists(position) && (!this.board.thereIsAPiece(position) || super.isThereOpponentPiece(position))) {
            possiblesMoves[position.getRow()][position.getColumn()] = true;
        }
        position.setValue(this.position.getRow() + 2, this.position.getColumn() + 1);
        if (this.board.positionExists(position) && (!this.board.thereIsAPiece(position) || super.isThereOpponentPiece(position))) {
            possiblesMoves[position.getRow()][position.getColumn()] = true;
        }
        return possiblesMoves;
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
        return "N";
    }
}
