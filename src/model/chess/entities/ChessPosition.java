package model.chess.entities;

import model.board.entities.Position;
import model.chess.exceptions.ChessException;

public class ChessPosition {

    private char column;

    private int row;

    public ChessPosition(char column, int row) {
        if ((column < 'a' || column > 'h') || (row < 1 || row > 8)) {
            throw new ChessException("Error instanting ChessPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition() {
        return new Position(8 - this.row, this.column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) (position.getColumn() + 'a'), 8 - position.getRow());
    }

    @Override
    public String toString() {
        return String.format("%c%s", this.column, this.row);
    }
}
