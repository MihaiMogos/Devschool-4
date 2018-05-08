package ro.ing.tech.devschool.testing.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import ro.ing.tech.devschool.testing.api.model.Account;
import ro.ing.tech.devschool.testing.api.repository.AccountRepository;
import ro.ing.tech.devschool.testing.api.service.AccountService;

import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class AccountServiceTest {

    @Mock
    private AccountRepository accountRepository;

    @InjectMocks
    private AccountService accountService;

    @Test
    public void shouldReturnAnAccount() {
        when(accountRepository.findById(anyLong())).thenReturn(Optional.of(new Account()));

        assertNotNull(accountService.findById(anyLong()));
    }

    @Test
    public void shouldReturnNullWhenAccountNotFound() {
        //TODO
    }

    @Test
    public void shouldCreateAnAccount() {
        String clientName = "NAME";
        Account expected = Account.builder().clientName(clientName).totalBalance(0.0).build();
        Account actual = accountService.createAccount(clientName);

        verify(accountRepository, times(1)).save(expected);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldDeleteAnAccount() {
        //TODO
    }

    @Test
    public void shouldNotDeleteAnAccount() {
        //TODO
    }

}