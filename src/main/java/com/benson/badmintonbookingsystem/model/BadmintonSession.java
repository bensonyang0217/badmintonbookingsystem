package com.benson.badmintonbookingsystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class BadmintonSession {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long session_id;

    @ManyToOne
    @JoinColumn(name="organizer_id", nullable=false)
    private User organizer;

    @ManyToOne
    @JoinColumn(name="gymnasium_id", nullable=false)
    private Gymnasium gymnasium;

    @ManyToOne
    @JoinColumn(name="timeslot_id", nullable=false)
    private Timeslot timeslot;

    @ManyToMany
    @JoinTable(
            name = "session_participant",
            joinColumns = @JoinColumn(name = "session_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id"))
    private Set<User> participants = new HashSet<>();
}
