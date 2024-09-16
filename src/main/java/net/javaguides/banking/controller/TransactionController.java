package net.javaguides.banking.controller;

import net.javaguides.banking.dto.TransactionDto;
import net.javaguides.banking.entity.Transaction;
import net.javaguides.banking.mapper.TransactionMapper;
import net.javaguides.banking.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@CrossOrigin(origins = "http://localhost:3000") // Ensure CORS is enabled for your React app
@RestController
@RequestMapping("/api/accounts")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    // Get all transactions
    @GetMapping("/transactions")
    public List<TransactionDto> getAllTransactions() {
        // Fetching all transactions from the service and converting to DTO
        List<Transaction> transactions = transactionService.getAllTransactions();

        // Mapping entity to DTO
        return transactions.stream()
                .map(TransactionMapper::mapToTransactionDto)
                .collect(Collectors.toList());
    }



    // Optional: Add more APIs for creating transactions, fetching by account, etc.
}
