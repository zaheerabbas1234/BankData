package com.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Bank;

@Repository
public interface BankRepo extends JpaRepository<Bank, Long>{

}
