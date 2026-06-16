package com.project.poc_module_import_declaration.model;

public record FraudDecision(
        String analysisId,
        int score,
        String decision
) {}