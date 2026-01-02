package com.community.communitybackend.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "helpers")
public class Helper {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false) private String name;
    private String email;
    private String phone;
    private String skills;
    @Column(columnDefinition = "TEXT") private String address;
    private LocalDateTime createdAt = LocalDateTime.now();

    public Helper() {}
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getSkills() { return skills; }
    public void setSkills(String s) { this.skills = s; }
    public String getAddress() { return address; }
    public void setAddress(String a) { this.address = a; }
    public LocalDateTime getCreatedAt() { return createdAt; }
    public void setCreatedAt(LocalDateTime c) { this.createdAt = c; }
}
