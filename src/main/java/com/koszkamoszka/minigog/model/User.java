package com.koszkamoszka.minigog.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "users")
@Data
public class User {
    @Id
    @Column(name = "userId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String realName;
    private String emailAddress;
    private String password;
}
