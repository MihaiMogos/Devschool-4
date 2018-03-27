package ro.isr.devschool.atm.transaction;

import ro.isr.devschool.atm.BankDatabase;
import ro.isr.devschool.atm.Screen;

/**
 * Created by Mucefix on 27/03/18.
 */
public class BalanceInquiry extends Transaction {


    public BalanceInquiry(int accountNumber, Screen screen, BankDatabase bankDatabase){
        super(accountNumber, screen, bankDatabase);
    }

    @Override
    public void execute(){
        BankDatabase bankDatabase = getBankDatabase();
        Screen screen = getScreen();

        double totalBalance = bankDatabase.getTotalBalance(getAccountNumber());

        screen.displayMessageLine("\nBalance Information:");
        screen.displayMessage("\n - Total balance:  ");
        screen.displayDollarAmount(totalBalance);
        screen.displayMessageLine("");
    }
}
