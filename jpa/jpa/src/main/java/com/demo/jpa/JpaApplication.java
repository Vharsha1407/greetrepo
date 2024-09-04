package com.demo.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.jpa.Repository.AccountRepository;
import com.demo.jpa.Repository.Loan;
import com.demo.jpa.Repository.LoanRepository;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}
	@Autowired
	AccountRepository accountRepository;
	@Autowired
	LoanRepository loanRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("main method is called");
		Account account=new Account(0, "swa", "vhar12@gmail.com",9);
		accountRepository.save(account);
		Loan loan=new Loan(7, "shop", 200000, account);
		loanRepository.save(loan);
	}

}
