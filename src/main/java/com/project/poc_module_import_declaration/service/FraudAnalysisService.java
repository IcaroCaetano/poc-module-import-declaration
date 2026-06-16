package com.project.poc_module_import_declaration.service;

import module java.base;
import com.project.poc_module_import_declaration.model.Customer;
import com.project.poc_module_import_declaration.model.FraudDecision;

public class FraudAnalysisService {

    public FraudDecision analyze(Customer customer) {

        var age = Period.between(
                customer.birthDate(),
                LocalDate.now()
        ).getYears();

        var score = calculateScore(customer, age);

        var decision = score >= 80 ? "APPROVED" : "MANUAL_REVIEW";

        return new FraudDecision(
                UUID.randomUUID().toString(),
                score,
                decision
        );
    }

    private int calculateScore(
            Customer customer,
            int age
    ) {

        var factors = List.of(
                customer.income() > 5000,
                age > 25,
                customer.cpf().length() == 11
        );

        return (int)
                factors.stream()
                        .filter(Boolean::booleanValue)
                        .count() * 30;
    }
}