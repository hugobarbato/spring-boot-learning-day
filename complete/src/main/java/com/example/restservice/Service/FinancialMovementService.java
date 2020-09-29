package com.example.restservice.Service;

import com.example.restservice.DTO.FinancialMovementDashboardDTO;
import com.example.restservice.Model.FinancialMovement;
import com.example.restservice.Repository.FinancialMovementRepository;
import com.example.restservice.Enums.FinancialMovementTypesEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialMovementService {

    @Autowired
    private FinancialMovementRepository repository;

    public List<FinancialMovement> list(FinancialMovementTypesEnum type) {
        return this.repository.findAllByType(type.value);
    }

    public FinancialMovement save(FinancialMovement movement){
        return this.repository.save(movement);
    }

    public ResponseEntity<String> remove(FinancialMovement movement){
        this.repository.delete(movement);
        return new ResponseEntity<>("Ok", HttpStatus.OK);
    }

    public ResponseEntity<FinancialMovementDashboardDTO> balance() {
        FinancialMovementDashboardDTO dashboardDTO = new FinancialMovementDashboardDTO();
        dashboardDTO.setIn(this.repository.findAllByType(FinancialMovementTypesEnum.IN.value));
        dashboardDTO.setOut(this.repository.findAllByType(FinancialMovementTypesEnum.OUT.value));
        return new ResponseEntity<>(dashboardDTO, HttpStatus.OK);
    }
}
