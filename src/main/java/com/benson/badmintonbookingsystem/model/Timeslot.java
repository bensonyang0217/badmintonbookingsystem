package com.benson.badmintonbookingsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


import java.time.LocalTime;

@Entity
@Data
public class Timeslot {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long timeslot_id;
    private String timeslot_name;
    private LocalTime start_time;
    private LocalTime end_time;

}
