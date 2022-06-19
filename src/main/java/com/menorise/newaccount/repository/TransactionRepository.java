package com.menorise.newaccount.repository;


import com.menorise.newaccount.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {
}
