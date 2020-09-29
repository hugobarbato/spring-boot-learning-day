package com.example.restservice.Controller;

import com.example.restservice.DTO.FinancialMovementDashboardDTO;
import com.example.restservice.Model.FinancialMovement;
import com.example.restservice.Service.FinancialMovementService;
import com.example.restservice.Enums.FinancialMovementTypesEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
public class FinancialMovementController {

    @Autowired
    private FinancialMovementService service;

    @GetMapping("/financial-movement/list/{type}")
    public List<FinancialMovement> list(@PathVariable FinancialMovementTypesEnum type) {
        return this.service.list(type);
    }

    @PostMapping("/financial-movement/save")
    public FinancialMovement save(@RequestBody FinancialMovement movement){
        return this.service.save(movement);
    }

    @DeleteMapping("/financial-movement/remove")
    public ResponseEntity<String> remove(@RequestBody FinancialMovement movement){
        return this.service.remove(movement);
    }

    @GetMapping("/financial-movement/balance")
    public ResponseEntity<FinancialMovementDashboardDTO> balance() {
        return this.service.balance();
    }


}
