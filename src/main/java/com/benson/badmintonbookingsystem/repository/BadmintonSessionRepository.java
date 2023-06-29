package com.benson.badmintonbookingsystem.repository;

import com.benson.badmintonbookingsystem.model.BadmintonSession;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BadmintonSessionRepository extends JpaRepository<BadmintonSession, Long> {
}
