package com.example.restservice.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FinancialMovement {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private int type;

    private Long value;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    private String description;
}
