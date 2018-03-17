package ro.isr.poo.chess.exception;

/**
 * Created by Mucefix on 15/03/18.
 */
/*
Spre deosebire de descendentii directi din Exception, exceptiile care au ca parint RutimeException
nu trebuie tratate
 */
public class InvalidPieceSetException extends RuntimeException {

    public InvalidPieceSetException(){
        super("Invalid piece set exception");
    }
}
