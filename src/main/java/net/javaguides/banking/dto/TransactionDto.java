// TransactionDto.java
package net.javaguides.banking.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionDto {
    private Long id;
    private double amount;
    private String type;
    private LocalDateTime timestamp;
    private Long accountId;

    public TransactionDto(Long id, double amount, String type, LocalDateTime timestamp,Long accountId) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.timestamp = timestamp;
        this.accountId = accountId;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }
}
