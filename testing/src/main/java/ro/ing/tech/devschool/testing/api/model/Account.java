package ro.ing.tech.devschool.testing.api.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "account")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@Builder
@EqualsAndHashCode
public class Account {

    @Id
    @GeneratedValue
    private Long accountNumber;

    private String clientName;

    private Double totalBalance;
}
