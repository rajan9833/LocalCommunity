package com.community.communitybackend.repositroy;

import com.community.communitybackend.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByUsername(String username);
    boolean existsByUsername(String username);
}