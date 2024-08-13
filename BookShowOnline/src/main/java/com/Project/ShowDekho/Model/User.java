package com.Project.ShowDekho.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int userId;
    private String password;
    private String name;
    private long contact;
    private String email;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public User(String password, String name, long contact, String email){
        this.password = password;
        this.name = name;
        this.contact = contact;
        this.email = email;
    }
}
