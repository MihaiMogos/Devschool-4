package ro.ing.tech.devschool.testing.api.repository;

import org.springframework.data.repository.CrudRepository;
import ro.ing.tech.devschool.testing.api.model.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
