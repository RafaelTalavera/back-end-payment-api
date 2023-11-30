package com.axioma.backendpaymentapi.repository;

import com.axioma.backendpaymentapi.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
