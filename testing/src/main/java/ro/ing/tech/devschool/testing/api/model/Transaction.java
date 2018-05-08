package ro.ing.tech.devschool.testing.api.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "transaction")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @Builder
public class Transaction {
    @Id
    @GeneratedValue
    private Long transactionId;

    private Long senderAccountNumber;

    private Long receiverAccountNumber;

    private Double amount;
}
