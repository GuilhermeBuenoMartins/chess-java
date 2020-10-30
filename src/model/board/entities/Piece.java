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
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    public boolean isThereAnyPossibleMove() {
        boolean[][] possibleMoves = possibleMoves();
        for (int i = 0; i < possibleMoves.length; i ++) {
            for (int j = 0; j < possibleMoves.length; j ++){
                if (possibleMoves[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public abstract String toString();
}
