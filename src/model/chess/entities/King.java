package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Position;
import model.chess.enumerations.Color;

public class King extends ChessPiece {

    public King(Color color, Board board) {
        super(color, board);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
        // Left above
        Position position = new Position(this.position.getRow() - 1, this.position.getColumn() - 1);
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Above
        position.setValue(this.position.getRow() - 1, this.position.getColumn());
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Right above
        position.setValue(this.position.getRow() - 1, this.position.getColumn() + 1);
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Left
        position.setValue(this.position.getRow(), this.position.getColumn() - 1);
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Right
        position.setValue(this.position.getRow(), this.position.getColumn() + 1);
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Left below
        position.setValue(position.getRow() + 1, position.getColumn() - 1);
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Below
        position.setValue(position.getRow() + 1, this.position.getColumn());
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Right below
        position.setValue(position.getRow() + 1, position.getColumn() + 1);
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
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
        return "K";
    }
}
