package com.qa.cinema.persistence;

import com.qa.cinema.persistence.domain.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByAdminNameEqualsAndAdminPasswordEquals(String adminName, String adminPassword);
}
