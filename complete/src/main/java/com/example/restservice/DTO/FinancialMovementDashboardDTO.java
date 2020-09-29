package com.example.restservice.DTO;

import com.example.restservice.Model.FinancialMovement;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FinancialMovementDashboardDTO {
    private List<FinancialMovement> in;
    private List<FinancialMovement> out;
    private Long balance;

    public Long getBalance(){
        this.balance = Long.parseLong("0");
        this.in.forEach(movement -> this.balance += movement.getValue());
        this.out.forEach(movement -> this.balance -= movement.getValue());
        return this.balance;
    }
}
