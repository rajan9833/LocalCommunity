package com.community.communitybackend.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "help_requests")
public class HelpRequest {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne @JoinColumn(name = "user_id")
    private User requester;
    @ManyToOne @JoinColumn(name = "helper_id")
    private Helper assignedHelper;
    @ManyToOne @JoinColumn(name = "category_id")
    private Category category;
    @Column(nullable = false) private String title;
    @Column(columnDefinition = "TEXT") private String description;
    private String contactName;
    private String contactPhone;
    @Column(columnDefinition = "TEXT") private String contactAddress;
    private String status = "PENDING";
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt;

    public HelpRequest() {}
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public User getRequester() { return requester; }
    public void setRequester(User r) { this.requester = r; }
    public Helper getAssignedHelper() { return assignedHelper; }
    public void setAssignedHelper(Helper h) { this.assignedHelper = h; }
    public Category getCategory() { return category; }
    public void setCategory(Category c) { this.category = c; }
    public String getTitle() { return title; }
    public void setTitle(String t) { this.title = t; }
    public String getDescription() { return description; }
    public void setDescription(String d) { this.description = d; }
    public String getContactName() { return contactName; }
    public void setContactName(String n) { this.contactName = n; }
    public String getContactPhone() { return contactPhone; }
    public void setContactPhone(String p) { this.contactPhone = p; }
    public String getContactAddress() { return contactAddress; }
    public void setContactAddress(String a) { this.contactAddress = a; }
    public String getStatus() { return status; }
    public void setStatus(String s) { this.status = s; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime c) { this.createdAt = c; }
    public LocalDateTime getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(LocalDateTime u) { this.updatedAt = u; }
}