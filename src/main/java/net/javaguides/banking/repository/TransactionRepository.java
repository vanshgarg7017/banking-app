package net.javaguides.banking.repository;

import net.javaguides.banking.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {
    // JpaRepository provides built-in methods like findAll(), findById(), save(), etc.
}
