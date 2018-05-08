package ro.ing.tech.devschool.testing.api.service;

import org.springframework.stereotype.Service;
import ro.ing.tech.devschool.testing.api.model.Account;
import ro.ing.tech.devschool.testing.api.repository.AccountRepository;

import java.util.Optional;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account findById(Long id) {
        Optional<Account> account = accountRepository.findById(id);

        if (account.isPresent()) {
            return account.get();
        }
        return null;
    }

    public Iterable<Account> findAll() {
        return accountRepository.findAll();
    }

    public Account createAccount(String clientName) {
        Account newAccount = Account.builder().clientName(clientName).totalBalance(0.0).build();

        accountRepository.save(newAccount);

        return newAccount;
    }

    public boolean deleteIfExists(Long id) {
        Optional<Account> account = accountRepository.findById(id);

        if (!account.isPresent()) {
            return false;
        }
        accountRepository.delete(account.get());

        return true;
    }
}
