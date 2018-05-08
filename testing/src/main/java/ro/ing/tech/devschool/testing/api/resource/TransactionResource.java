package ro.ing.tech.devschool.testing.api.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ro.ing.tech.devschool.testing.api.service.TransactionService;

@RestController
@RequestMapping("transaction")
public class TransactionResource {

    private TransactionService transactionService;

    public TransactionResource(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PutMapping
    public ResponseEntity<String> transfer(@RequestParam(value = "sender") Long senderAccountNumber,
                                           @RequestParam(value = "receiver") Long receiverAccountNumber,
                                           @RequestParam(value = "amount") Double amount) {

        boolean transactionResult =
                transactionService.transfer(senderAccountNumber, receiverAccountNumber, amount);

        if (!transactionResult) {
            return ResponseEntity.badRequest().body("Transaction failed.");
        }

        return ResponseEntity.ok().body("Transaction completed.");
    }

    @PutMapping("atm")
    public ResponseEntity<String> atmTransaction(@RequestParam(value = "receiver") Long receiverAccountNumber,
                                                 @RequestParam(value = "amount") Double amount) {
        boolean transactionResult =
                transactionService.atmTransaction(receiverAccountNumber, amount);

        if (!transactionResult) {
            return ResponseEntity.badRequest().body("Transaction failed.");
        }

        return ResponseEntity.ok().body("Transaction completed.");
    }

}