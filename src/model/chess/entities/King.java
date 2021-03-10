package model.chess.entities;

import model.board.entities.Board;
import model.board.entities.Position;
import model.chess.enumerations.Color;

public class King extends ChessPiece {

    ChessMatch chessMatch;

    public King(Color color, Board board, ChessMatch chessMatch) {
        super(color, board);
        this.chessMatch = chessMatch;
    }

    private boolean testRookCastling(Position position) {
        ChessPiece piece = (ChessPiece) getBoard().piece(position);
        return piece != null && piece instanceof Rook && piece.getColor() == getColor() && piece.getMoveCount() == 0;
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] possibleMoves = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position position = new Position(this.position.getRow(), this.position.getColumn());
        // Left above
        position.setValue(this.position.getRow() -1, this.position.getColumn() - 1);
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
        position.setValue(this.position.getRow() + 1, this.position.getColumn() - 1);
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Below
        position.setValue(this.position.getRow() + 1, this.position.getColumn());
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Right below
        position.setValue(this.position.getRow() + 1, this. position.getColumn() + 1);
        if (this.board.positionExists(position) && !this.board.thereIsAPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        if (this.board.positionExists(position) && isThereOpponentPiece(position)) {
            possibleMoves[position.getRow()][position.getColumn()] = true;
        }
        // Special move castling
        position.setValue(this.position.getRow(), this. position.getColumn());
        if(getMoveCount() == 0 && !chessMatch.getCheckMate()) {
            //Special move kingside rook
            Position posT1 = new Position(position.getRow(), position.getColumn() + 3);
            if (testRookCastling(posT1)) {
                Position position1 = new Position(position.getRow(), position.getColumn() + 1);
                Position position2 = new Position(position.getRow(), position.getColumn() + 2);
                if (getBoard().piece(position1) == null && getBoard().piece(position2) == null) {
                    possibleMoves[position.getRow()][position.getColumn() + 2] = true;
                }
            }
            //Special move queenside rook
            Position posT2 = new Position(position.getRow(), position.getColumn() - 4);
            if (testRookCastling(posT2)) {
                Position position1 = new Position(position.getRow(), position.getColumn() - 1);
                Position position2 = new Position(position.getRow(), position.getColumn() - 2);
                Position position3 = new Position(position.getRow(), position.getColumn() - 3);
                if (getBoard().piece(position1) == null && getBoard().piece(position2) == null && getBoard().piece(position3) == null) {
                    possibleMoves[position.getRow()][position.getColumn() - 2] = true;
                }
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
