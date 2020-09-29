package com.example.restservice.Repository;

import com.example.restservice.Model.FinancialMovement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FinancialMovementRepository  extends JpaRepository<FinancialMovement, Long> {

    List<FinancialMovement> findAllByType(int type);

}
