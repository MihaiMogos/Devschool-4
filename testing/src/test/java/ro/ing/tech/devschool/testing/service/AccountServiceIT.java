package ro.ing.tech.devschool.testing.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ro.ing.tech.devschool.testing.api.model.Account;
import ro.ing.tech.devschool.testing.api.service.AccountService;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountServiceIT {

    @Autowired
    private AccountService accountService;

    private long numberOfAccounts = 5L;

    @Test
    public void shouldFindAnAccount() {
        String clientName = "Mihai";
        long clientId = 1L;

        assertEquals(clientName, accountService.findById(clientId).getClientName());
    }

    @Test
    public void shouldNotFindAnyAccount() {
        //TODO
    }

    @Test
    public void shouldAddANewAccount() {
        //TODO
    }

    @Test
    public void shouldDeleteAnAccount() {
        //TODO
    }

    @Test
    public void shouldFindAllAccounts() {
        Iterable<Account> accounts = accountService.findAll();

        assertEquals(numberOfAccounts, accounts.spliterator().getExactSizeIfKnown());
    }


}
