package com.community.communitybackend.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
public class Notification {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne @JoinColumn(name = "user_id")
    private User user;
    private String message;
    private boolean readFlag = false;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Notification() {}
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public User getUser() { return user; }
    public void setUser(User u) { this.user = u; }
    public String getMessage() { return message; }
    public void setMessage(String m) { this.message = m; }
    public boolean isReadFlag() { return readFlag; }
    public void setReadFlag(boolean r) { this.readFlag = r; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime c) { this.createdAt = c; }
}