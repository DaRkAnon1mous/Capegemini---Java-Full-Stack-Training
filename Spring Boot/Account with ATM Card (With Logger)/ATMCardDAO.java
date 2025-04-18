package com.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bean.Account;
import com.bean.ATMCard;
import com.repository.ATMCardRepository;
import com.repository.AccountRepository;

@Component
public class ATMCardDAO {

    Logger logger = LoggerFactory.getLogger(ATMCardDAO.class);

    @Autowired
    private ATMCardRepository atmCardRepo;

    @Autowired
    private AccountRepository accountRepo;

    public void issueATMCardToAccount(int accountNumber, ATMCard atmCardObject) {
        if (atmCardRepo.existsByAccountAccountNumber(accountNumber)) {
            logger.error("ATM card already exists for account number {}", accountNumber);
            return;
        }

        Account account = accountRepo.findById(accountNumber).orElse(null);

        if (account != null) {
            atmCardObject.setAccount(account);
            account.setAtmCard(atmCardObject);

            // Save the account - since it has cascade.ALL, it will save the ATMCard too
            accountRepo.save(account);

            logger.info("ATM card successfully issued to account number {}", accountNumber);
        } else {
            logger.error("Account number {} not found", accountNumber);
        }
    }

}
