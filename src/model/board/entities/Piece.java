package model.board.entities;

public abstract class Piece {

    protected Position position;

    protected Board board;

    public Piece(Board board) {
        this.board = board;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Board getBoard() {
        return board;
    }

    public abstract boolean[][] possibleMoves();

    public boolean posssibleMove(Position position) {
        // TODO: write the code
        return false;
    }

    public boolean isThereAnyPossibleMove() {
        // TODO: write the code
        return false;
    }

    @Override
    public abstract String toString();
}
