package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Position;
import model.chess.enumerations.Color;

public class Bishop extends ChessPiece {

    public Bishop(Color color, Board board) {
        super(color, board);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] possibleMoves = new boolean[this.board.getRows()][this.board.getColumns()];
        Position position = new Position(this.position.getRow(), this.position.getColumn());
        // Top left diagonal
        position.setValue(this.position.getRow() - 1, this.position.getColumn() - 1);
        while(this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
            position.setValue(position.getRow() - 1, position.getColumn() - 1);
        }
        if(this.board.positionExists(position) && super.isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Top right diagonal
        position.setValue(this.position.getRow() - 1, this.position.getColumn() + 1);
        while(this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
            position.setValue(position.getRow() - 1, position.getColumn() + 1);
        }
        if(this.board.positionExists(position) && super.isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Lower left diagonal
        position.setValue(this.position.getRow() + 1, this.position.getColumn() - 1);
        while(this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
            position.setValue(position.getRow() + 1, position.getColumn() - 1);
        }
        if(this.board.positionExists(position) && super.isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Lower rigth diagonal
        position.setValue(this.position.getRow() + 1, this.position.getColumn() + 1);
        while(this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
            position.setValue(position.getRow() + 1, position.getColumn() + 1);
        }
        if(this.board.positionExists(position) && super.isThereOpponentPiece(position)) {
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
        return "B";
    }
}
