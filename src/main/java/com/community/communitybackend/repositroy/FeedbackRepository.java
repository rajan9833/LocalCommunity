package com.community.communitybackend.repositroy;

import com.community.communitybackend.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Integer> {

    List<Feedback> findByUser_Id(Integer userId);

    List<Feedback> findByHelper_Id(Integer helperId);

    List<Feedback> findByRequest_Id(Integer requestId);

    List<Feedback> findByRating(int rating);

    @Query("SELECT AVG(f.rating) FROM Feedback f WHERE f.helper.id = ?1")
    Double getAverageRatingForHelper(Integer helperId);

    @Query("SELECT f FROM Feedback f ORDER BY f.createdAt DESC")
    List<Feedback> findLatestFeedbacks();
}
