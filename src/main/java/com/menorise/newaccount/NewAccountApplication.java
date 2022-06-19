package com.menorise.newaccount;

import com.menorise.newaccount.model.Customer;
import com.menorise.newaccount.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;

@SpringBootApplication
public class NewAccountApplication implements CommandLineRunner {

	private final CustomerRepository customerRepository;

	public NewAccountApplication(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(NewAccountApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Customer customer = customerRepository.save(new Customer("Ahmet", "Kala"));
		System.out.println(customer);
	}
}
