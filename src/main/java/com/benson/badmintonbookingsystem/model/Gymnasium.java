package com.benson.badmintonbookingsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import jakarta.persistence.Id;

@Entity
@Data
public class Gymnasium {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long gymnasium_id;
    private String gymnasium_name;
    private String gymnasium_address;
    private String gymnasium_phone;
    private int number_of_courts;
}
