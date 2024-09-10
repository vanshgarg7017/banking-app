package net.javaguides.banking.mapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.javaguides.banking.dto.AccountDto;
import net.javaguides.banking.entity.Account;
@Getter
@AllArgsConstructor
public class AccountMapper {
    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(
            accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );
        return  account;
    }
    public static AccountDto mapToAccountDto(Account account){
        AccountDto accountDto=new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return  accountDto;
    }

}
