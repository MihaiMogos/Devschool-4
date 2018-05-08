package ro.ing.tech.devschool.testing;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ro.ing.tech.devschool.testing.api.model.Account;
import ro.ing.tech.devschool.testing.api.repository.AccountRepository;

@SpringBootApplication
public class TestingApplication implements CommandLineRunner {

	private AccountRepository accountRepository;

	public TestingApplication(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		accountRepository.save(Account.builder().clientName("Mihai").totalBalance(100.0).build());
		accountRepository.save(Account.builder().clientName("Gabriel").totalBalance(100.0).build());
		accountRepository.save(Account.builder().clientName("Andrei").totalBalance(1000.0).build());
		accountRepository.save(Account.builder().clientName("Florin").totalBalance(2500.0).build());
		accountRepository.save(Account.builder().clientName("Alin").totalBalance(0.0).build());
	}

	public static void main(String[] args) {
		SpringApplication.run(TestingApplication.class, args);
	}
}