package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bean.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findByAtmCardCardType(String cardType);
}
