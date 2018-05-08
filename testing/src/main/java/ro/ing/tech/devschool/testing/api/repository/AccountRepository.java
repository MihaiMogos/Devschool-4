package ro.ing.tech.devschool.testing.api.repository;

import org.springframework.data.repository.CrudRepository;
import ro.ing.tech.devschool.testing.api.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> { }
