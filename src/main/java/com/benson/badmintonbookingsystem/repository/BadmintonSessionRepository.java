package com.benson.badmintonbookingsystem.repository;

import com.benson.badmintonbookingsystem.model.BadmintonSession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BadmintonSessionRepository extends JpaRepository<BadmintonSession, Long> {
}
