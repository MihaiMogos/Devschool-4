package ro.isr.devschool.atm;

import java.util.Scanner;

/**
 * Created by Mucefix on 27/03/18.
 */
public class Keypad {

    private Scanner input;

    public Keypad(){
        this.input = new Scanner(System.in);
    }

    public int getInput(){
        return input.nextInt();
    }

}
