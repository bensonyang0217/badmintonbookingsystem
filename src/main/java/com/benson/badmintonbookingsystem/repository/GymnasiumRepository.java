package com.benson.badmintonbookingsystem.repository;

import com.benson.badmintonbookingsystem.model.Gymnasium;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GymnasiumRepository extends JpaRepository<Gymnasium,Long> {
}
