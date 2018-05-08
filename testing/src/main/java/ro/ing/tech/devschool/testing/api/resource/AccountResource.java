package ro.ing.tech.devschool.testing.api.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ro.ing.tech.devschool.testing.api.model.Account;
import ro.ing.tech.devschool.testing.api.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountResource {

    private AccountService accountService;

    public AccountResource(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("{id}")
    public ResponseEntity<Account> getAccount(@PathVariable(name = "id") Long id) {
        Account account = accountService.findById(id);

        if (account == null) {
            return new ResponseEntity<>(account, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(account, HttpStatus.OK);
    }

    @GetMapping
    public Iterable<Account> getAccounts() {
        return accountService.findAll();
    }

    @PostMapping("add")
    public Account addAccount(@RequestBody String clientName) {
        return accountService.createAccount(clientName);
    }

    @DeleteMapping("{id}")
    public ResponseEntity delete(@PathVariable(name = "id") Long id) {
        boolean deleted = accountService.deleteIfExists(id);

        if (deleted) {
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }

}
