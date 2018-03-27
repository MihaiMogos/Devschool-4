package ro.isr.devschool.atm.transaction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ro.isr.devschool.atm.BankDatabase;
import ro.isr.devschool.atm.Screen;

/**
 * Created by Mucefix on 27/03/18.
 */
@Getter
@AllArgsConstructor
public abstract class Transaction {

    private int accountNumber;
    private Screen screen;
    private BankDatabase bankDatabase;

    abstract public void execute();
}
