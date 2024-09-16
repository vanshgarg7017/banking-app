package net.javaguides.banking.mapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.javaguides.banking.dto.TransactionDto;
import net.javaguides.banking.entity.Transaction;

@Getter
@AllArgsConstructor
public class TransactionMapper {
    public static Transaction mapToTransaction(TransactionDto transactionDto) {
        Transaction transaction = new Transaction(
                transactionDto.getId(),
                transactionDto.getAmount(),
                transactionDto.getType(),
                transactionDto.getTimestamp()
        );
        return transaction;
    }

    public static TransactionDto mapToTransactionDto(Transaction transaction) {
        TransactionDto transactionDto = new TransactionDto(
                transaction.getId(),
                transaction.getAmount(),
                transaction.getType().name(),
                transaction.getTimestamp(),
                transaction.getId()
        );
        return transactionDto;
    }
}
