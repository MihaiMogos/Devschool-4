package ro.isr.poo.chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Mucefix on 15/03/18.
 */
/*
clasa - schita a obiectelor pe care vreau sa le creez
atribut - caracteristica a unui obiect
metoda - comportament/actiune a obiectului
obiect - "produs finit" pe baza unei schite
constructor - metoda care creaza/instantiaza un obiect; aloca memorie si initializeaza un obiect;
            - nu returneaza nimic
            - are acelasi nume cu clasa pentru care construieste obiecte
 */
@AllArgsConstructor
@NoArgsConstructor
public class Square {

    /*
    Encapsulation - don't expose to the outside world more than is needed
    modificatori de access:
        private
        default = package
        protected
        public
     */
    @Setter @Getter
    private int row;
    @Setter @Getter
    private int column;

    /*public Square(){
    }

    public int getRow(){
        return this.row;
    }
    public void setRow(int row){
        this.row = row;
    }*/
}
