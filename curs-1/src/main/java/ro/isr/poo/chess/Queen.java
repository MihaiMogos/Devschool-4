package ro.isr.poo.chess;

/**
 * Created by Mucefix on 15/03/18.
 */
public class Queen extends Piece{

    public Queen(PieceColor color, Square placeAt){
        super(color, placeAt, false);
    }

    @Override
    public Square[] validMoves() {
        return new Square[0];
    }

    @Override
    public Square[] attackSquares() {
        return new Square[0];
    }

    @Override
    public Square[] captureFreeMoves() {
        return new Square[0];
    }

    @Override
    public boolean toBeCaptured() {
        return false;
    }
}
