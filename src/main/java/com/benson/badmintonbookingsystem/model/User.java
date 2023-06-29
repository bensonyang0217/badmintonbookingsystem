package com.benson.badmintonbookingsystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;
    private String user_name;
    // other fields as needed

    @OneToMany(mappedBy = "organizer")
    private Set<BadmintonSession> organizedSessions = new HashSet<>();

    @ManyToMany(mappedBy = "participants")
    private Set<BadmintonSession> participatedSessions = new HashSet<>();
}
