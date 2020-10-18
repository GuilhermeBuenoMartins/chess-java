package model.board.entities;

public class Position {

    private int row;

    private int column;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setValues(int row, int column) {
        this.row = row;
        this.column = column;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)", this.row, this.column);
    }
}
