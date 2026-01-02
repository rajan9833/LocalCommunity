package com.community.communitybackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityBackendApplication.class, args);

        System.out.println("\n" + "=".repeat(70));
        System.out.println("🎉 COMMUNITY HELP PLATFORM - STARTED SUCCESSFULLY!");
        System.out.println("=".repeat(70));
        System.out.println("🌐 Application URL: http://localhost:8080");
        System.out.println("👤 User Login: http://localhost:8080/login");
        System.out.println("🔐 Admin Login: http://localhost:8080/admin/login");
        System.out.println("📊 Database: community (MySQL - localhost:3306)");
        System.out.println("=".repeat(70));
        System.out.println("📝 Default Admin: username=admin, password=admin123");
        System.out.println("=".repeat(70) + "\n");
    }

}
