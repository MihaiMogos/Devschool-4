package ro.isr.poo.chess;

/**
 * Created by Mucefix on 15/03/18.
 */
public interface PlayerEngine {

    //this is actually static final
    String test = "valoare de test";

    /*
    intr-o interfata putem avea
        - atribute - static & final
        - metode abstraacte

    static - atribute si metode care apartin Clasei de obiecte si nu unui anumit obiect
           - blocuri statice --> definite in metode sau clase
    final - desemneaza o constant
          - atribute - nu ii mai pot modifica referinta
          - metoda - nu poate fi suprascrisa
          - clasa - nu poate fi mostenita
          - parametri de metoda - nu isi pot modifica referinta
     */

    //metodele abstracte nu au implementare
    public abstract void makeMove();

}


