package ro.isr.poo.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Created by Mucefix on 15/03/18.
 */
@Getter @Setter
@AllArgsConstructor
public abstract class Piece {

    private PieceColor color;
    private Square placeAt;
    private boolean moved;

    //abstract methods do not have a body
    public abstract Square[] validMoves();
    public abstract Square[] attackSquares();
    public abstract Square[] captureFreeMoves();
    public abstract boolean toBeCaptured();
}
