package com.siit.hospital_manager.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@SuperBuilder
@RequiredArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Integer id;

    @NotNull(message="user name should not be null")
    @Column(name="user_name", unique=true)
    private String userName;

    @NotNull(message="password should not be null")
    private String password;

    private boolean isActive;

    @NotNull(message="roles should not be null")
    private String roles;

}