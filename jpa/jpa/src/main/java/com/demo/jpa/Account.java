package com.demo.jpa;

import com.demo.jpa.Repository.Loan;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Data

@AllArgsConstructor

public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountnumber;
    private String name;
    private String email;
    private float balance;
    @OneToOne()
    private Loan loan;
}
    