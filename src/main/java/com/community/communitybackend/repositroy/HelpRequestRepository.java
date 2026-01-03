package com.community.communitybackend.repositroy;

import com.community.communitybackend.model.HelpRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface HelpRequestRepository extends JpaRepository<HelpRequest, Integer> {

    List<HelpRequest> findByStatus(String status);

    @Query("SELECT hr FROM HelpRequest hr WHERE hr.category.name = ?1")
    List<HelpRequest> findByCategoryName(String categoryName);

    List<HelpRequest> findByRequester_Id(Integer userId);

    List<HelpRequest> findByAssignedHelper_Id(Integer helperId);

    @Query("SELECT hr FROM HelpRequest hr WHERE hr.status = 'PENDING' ORDER BY hr.createdAt DESC")
    List<HelpRequest> findPendingRequests();

    @Query("SELECT hr FROM HelpRequest hr WHERE hr.status IN ('URGENT', 'CRITICAL') ORDER BY hr.createdAt DESC")
    List<HelpRequest> findUrgentRequests();

    long countByStatus(String status);
}
