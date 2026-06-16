package com.project.poc_module_import_declaration.model;

import java.time.LocalDate;

public record Customer(
        String cpf,
        String name,
        LocalDate birthDate,
        double income
) {}