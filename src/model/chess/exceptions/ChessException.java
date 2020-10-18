package model.chess.exceptions;

public class ChessException extends Exception {

    private static final long serialVersionUID = 1l;

    public void ChessException(String msg) {
        new Exception(msg);
    }
}
