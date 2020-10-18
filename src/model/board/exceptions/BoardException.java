package model.board.exceptions;

public class BoardException extends Exception {

    private static final long serialVersionUID = 1l;

    public void BoardException(String msg) {
        new Exception(msg);
    }
}
