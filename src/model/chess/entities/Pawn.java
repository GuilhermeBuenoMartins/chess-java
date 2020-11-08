package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Position;
import model.chess.enumerations.Color;

public class Pawn extends ChessPiece {

    public Pawn(Color color, Board board) {
        super(color, board);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] possibleMoves = new boolean[super.board.getRows()][super.board.getColumns()];
        Position position = new Position(super.position.getRow(), super.position.getColumn());
        // White moviments
        if(super.getColor() == Color.WHITE) {
            position.setValue(super.position.getRow() - 1, super.position.getColumn());
            if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)){
                possibleMoves[position.getRow()][position.getColumn()] = true;
                position.setValue(this.position.getRow() - 2, this.position.getColumn());
                if (this.board.positionExists(position) && !this.board.thereIsAPiece(position) && super.getMoveCount() == 0){
                    possibleMoves[position.getRow()][position.getColumn()] = true;
                }
            }
            position.setValue(super.position.getRow() - 1, super.position.getColumn() -1);
            if (this.board.positionExists(position) && super.isThereOpponentPiece(position)) {
                possibleMoves[position.getRow()][position.getColumn()] = true;
            }
            position.setValue(super.position.getRow() - 1, super.position.getColumn() + 1);
            if (this.board.positionExists(position) && super.isThereOpponentPiece(position)) {
                possibleMoves[position.getRow()][position.getColumn()] = true;
            }
        } else {
                position.setValue(super.position.getRow() + 1, super.position.getColumn());
                if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)){
                    possibleMoves[position.getRow()][position.getColumn()] = true;
                    position.setValue(this.position.getRow() + 2, this.position.getColumn());
                    if (this.board.positionExists(position) && !this.board.thereIsAPiece(position) && super.getMoveCount() == 0){
                        possibleMoves[position.getRow()][position.getColumn()] = true;
                    }
                }
                position.setValue(super.position.getRow() + 1, super.position.getColumn() -1);
                if (this.board.positionExists(position) && super.isThereOpponentPiece(position)) {
                    possibleMoves[position.getRow()][position.getColumn()] = true;
                }
                position.setValue(super.position.getRow() + 1, super.position.getColumn() + 1);
                if (this.board.positionExists(position) && super.isThereOpponentPiece(position)) {
                    possibleMoves[position.getRow()][position.getColumn()] = true;
                }
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
    public String toString() {
        return "P";
    }
}
