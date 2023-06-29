package com.benson.badmintonbookingsystem.repository;

import com.benson.badmintonbookingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
