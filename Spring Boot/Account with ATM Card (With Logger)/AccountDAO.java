package com.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Account;
import com.repository.AccountRepository;

@Component
public class AccountDAO {

    Logger logger = LoggerFactory.getLogger(AccountDAO.class);

    @Autowired
    private AccountRepository accountRepo;

    public void openAccount(Account account) {
        accountRepo.save(account);
        logger.info("Account with id {} added successfully", account.getAccountNumber());
    }

    public List<Account> retrieveAccountBasedOnCardType(String cardType) {
        List<Account> accounts = accountRepo.findByAtmCardCardType(cardType);
        if (accounts.isEmpty()) {
            logger.error("No account with this card type {}", cardType);
        } else {
            logger.info("Account details with card type {} retrieved successfully", cardType);
        }
        return accounts;
    }
}
