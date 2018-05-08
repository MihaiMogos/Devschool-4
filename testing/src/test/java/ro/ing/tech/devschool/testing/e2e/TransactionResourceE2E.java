package ro.ing.tech.devschool.testing.e2e;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class TransactionResourceE2E {

    @Test
    public void shouldAddMoneyIntoExistingAccout() {
        long receiverAccountNumber = 1;
        //TODO
    }

    @Test
    public void shouldTransferMoneyBetweenExistingAccounts() {
        long receiverAccountNumber = 1;
        long senderAccountNumber = 2;
        double amount = 50;
        //TODO check responseBody
    }

}
