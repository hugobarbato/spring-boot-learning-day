package com.example.restservice.Enums;


import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class FinancialMovementTypesEnumConverter implements Converter<String, FinancialMovementTypesEnum> {
    @Override
    public FinancialMovementTypesEnum convert(String source) {
        return FinancialMovementTypesEnum.valueOf(source.toUpperCase());
    }
}
