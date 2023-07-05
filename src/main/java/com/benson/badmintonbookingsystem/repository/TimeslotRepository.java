package com.benson.badmintonbookingsystem.repository;

import com.benson.badmintonbookingsystem.model.Timeslot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeslotRepository extends JpaRepository<Timeslot,Long> {
}
