package net.javaguides.banking.service;

import net.javaguides.banking.entity.Transaction;
import net.javaguides.banking.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository transactionRepository;

    // Retrieve all transactions
    public List<Transaction> getAllTransactions() {
        return transactionRepository.findAll();
    }

    // Optional: Additional methods for creating transactions, finding by account, etc.
}