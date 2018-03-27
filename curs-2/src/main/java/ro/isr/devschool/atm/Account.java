package ro.isr.devschool.atm;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

/**
 * Created by Mucefix on 27/03/18.
 */
@EqualsAndHashCode(of = ("accountNumber"))
@AllArgsConstructor
public class Account {
    @Getter private int accountNumber;
    private int pin;
    @Getter private double totalBalance;

    public boolean validatePIN(int userPIN){
        if(userPIN == pin){
            return true;
        }
        return false;
    }

    public void credit(double amount){
        totalBalance += amount;
    }
    public void debit(double amount){
        totalBalance -= amount;
    }

}
