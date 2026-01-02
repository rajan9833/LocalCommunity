package com.community.communitybackend.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "feedbacks")
public class Feedback {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne @JoinColumn(name = "helper_id")
    private Helper helper;
    @ManyToOne @JoinColumn(name = "request_id")
    private HelpRequest request;
    private int rating;
    @Column(columnDefinition = "TEXT") private String comments;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Feedback() {}
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public User getUser() { return user; }
    public void setUser(User u) { this.user = u; }
    public Helper getHelper() { return helper; }
    public void setHelper(Helper h) { this.helper = h; }
    public HelpRequest getRequest() { return request; }
    public void setRequest(HelpRequest r) { this.request = r; }
    public int getRating() { return rating; }
    public void setRating(int r) { this.rating = r; }
    public String getComments() { return comments; }
    public void setComments(String c) { this.comments = c; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime c) { this.createdAt = c; }
}