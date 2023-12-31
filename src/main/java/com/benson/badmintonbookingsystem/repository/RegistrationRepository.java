package com.benson.badmintonbookingsystem.repository;

import com.benson.badmintonbookingsystem.model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
