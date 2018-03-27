package ro.isr.devschool.atm;

import ro.isr.devschool.atm.transaction.BalanceInquiry;
import ro.isr.devschool.atm.transaction.Deposit;
import ro.isr.devschool.atm.transaction.Transaction;
import ro.isr.devschool.atm.transaction.Withdrawal;

/**
 * Created by Mucefix on 27/03/18.
 */
public class ATM {
    private static final int BALANCE_INQUIRY = 1;
    private static final int WITHDRAWAL = 2;
    private static final int DEPOSIT = 3;
    private static final int EXIT = 4;
    private boolean userAuthenticated;
    private int currentAccountNumber;
    private Screen screen;
    private Keypad keypad;
    private CashDispenser cashDispenser;
    private BankDatabase bankDatabase;

    public ATM(){
        userAuthenticated = false;
        currentAccountNumber = 0;
        screen = new Screen();
        keypad = new Keypad();
        cashDispenser = new CashDispenser();
        bankDatabase = new BankDatabase();
    }

    public void run(){
        while(true){
            while(!userAuthenticated){
                screen.displayMessageLine("\nWelcome");
                authenticateUser();
            }
            performTransactions();
            userAuthenticated = false;
            currentAccountNumber = 0;
            screen.displayMessageLine("\nThank you! Goodbye!");
        }
    }

    private void authenticateUser(){
        screen.displayMessage("\nPlease enter your account number: ");
        int accountNumber = keypad.getInput();
        screen.displayMessage("\nPlease enter your PIN:");
        int pin = keypad.getInput();

        userAuthenticated = bankDatabase.authenticateUser(accountNumber,pin);
        if( userAuthenticated ){
            currentAccountNumber = accountNumber;
        }else{
            screen.displayMessageLine("Invalid account number or PIN. Please try again");
        }
    }

    private void performTransactions(){
        Transaction currentTransaction = null;
        boolean userExited = false;

        while( !userExited){
            int mainMenuSelection = displayMainMenu();
            switch (mainMenuSelection){
                case BALANCE_INQUIRY:case WITHDRAWAL:case DEPOSIT:
                    currentTransaction = createTransaction(mainMenuSelection);
                    currentTransaction.execute();
                    break;
                case EXIT:
                    screen.displayMessageLine("\nExiting the system...");
                    userExited = true;
                    break;
                default:
                    screen.displayMessageLine("\nYou did not enter a valid selection. Try again.");
                    break;
            }
        }
    }

    private Transaction createTransaction(int type){
        switch (type){
            case BALANCE_INQUIRY:
                return new BalanceInquiry(currentAccountNumber,screen,bankDatabase);
            case WITHDRAWAL:
                return new Withdrawal(currentAccountNumber, screen, bankDatabase, keypad, cashDispenser);
            case DEPOSIT:
                return new Deposit(currentAccountNumber, screen, bankDatabase, keypad);
            default:
                return null;
        }
    }

    private int displayMainMenu(){
        screen.displayMessageLine("\nMain menu:");
        screen.displayMessageLine("1 - View my balance");
        screen.displayMessageLine("2 - Withdraw cash");
        screen.displayMessageLine("3 - Deposit funds");
        screen.displayMessageLine("4 - Exit");
        screen.displayMessage("Enter a choice: ");
        return keypad.getInput();
    }


}
