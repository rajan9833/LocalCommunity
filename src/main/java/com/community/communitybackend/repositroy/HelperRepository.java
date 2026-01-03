package com.community.communitybackend.repositroy;

import com.community.communitybackend.model.Helper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HelperRepository extends JpaRepository<Helper, Integer> {

    @Query("SELECT h FROM Helper h WHERE LOWER(h.skills) LIKE LOWER(CONCAT('%', ?1, '%'))")
    List<Helper> findBySkillsContaining(String skill);

    Helper findByEmail(String email);
    Helper findByPhone(String phone);
}