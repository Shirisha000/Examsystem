package com.shirisha.examsystem.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")          // "user" is a reserved word in MySQL
@Getter @Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private String password;    // stored as a BCrypt hash, never plain text

    @Enumerated(EnumType.STRING)
    private Role role;
}