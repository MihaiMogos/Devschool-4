package ro.isr.devschool.atm;

/**
 * Created by Mucefix on 27/03/18.
 */
public class Screen {

    public void displayMessage(String message){
        System.out.print(message);
    }
    public void displayMessageLine(String message){
        System.out.println(message);
    }
    public void displayDollarAmount(double amount){
        System.out.printf("$%,.2f", amount);
    }

}
