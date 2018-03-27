package ro.isr.devschool.atm;

/**
 * Created by Mucefix on 27/03/18.
 */
public class CashDispenser {
    private static final int INITIAL_BILLS = 50;
    private  int availableBBills;

    public CashDispenser(){ availableBBills = INITIAL_BILLS; }

    public boolean hasSufficientBills(int amount){
        int billsRequired = amount / 20;
        return (availableBBills >= billsRequired);
    }

    public void dispenseCash(int amount){
        int billsRequired = amount / 20;
        availableBBills -= billsRequired;
    }

}
