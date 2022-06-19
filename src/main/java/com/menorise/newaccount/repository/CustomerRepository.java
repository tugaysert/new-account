package com.menorise.newaccount.repository;

import com.menorise.newaccount.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
