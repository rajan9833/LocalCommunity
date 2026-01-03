package com.community.communitybackend.repositroy;

import com.community.communitybackend.model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Integer> {

    List<Notification> findByUser_Id(Integer userId);

    @Query("SELECT n FROM Notification n WHERE n.user.id = ?1 AND n.readFlag = false ORDER BY n.createdAt DESC")
    List<Notification> findUnreadByUserId(Integer userId);

    @Query("SELECT n FROM Notification n WHERE n.user.id = ?1 ORDER BY n.createdAt DESC")
    List<Notification> findAllByUserIdOrderByCreatedAtDesc(Integer userId);

    @Query("SELECT COUNT(n) FROM Notification n WHERE n.user.id = ?1 AND n.readFlag = false")
    long countUnreadByUserId(Integer userId);
}