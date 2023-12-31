package com.benson.badmintonbookingsystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Registration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long registration_id;

    @ManyToOne
    @JoinColumn(name="badminton_session_id", nullable=false)
    private BadmintonSession badmintonSession;

    @ManyToOne
    @JoinColumn(name="participant_id", nullable=false)
    private User participant;
}
