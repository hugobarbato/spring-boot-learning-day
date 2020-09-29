package com.example.restservice.Enums;

public enum FinancialMovementTypesEnum {
    ENTRADA(1),
    IN(1),
    SAIDA(2),
    OUT(2);

    public int value;

    FinancialMovementTypesEnum(int i) {
        value = i;
    }
}
