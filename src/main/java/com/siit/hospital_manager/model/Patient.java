package com.siit.hospital_manager.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import java.util.List;

@Entity
@Table(name="patients")
@SuperBuilder
@Getter
@Setter
@RequiredArgsConstructor
@PrimaryKeyJoinColumn(referencedColumnName = "user_id")
public class Patient extends User {

    private String firstName;

    private String lastName;

    private String email;

    private Integer age;

    private String phoneNumber;

    @OneToMany(mappedBy = "patient", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    List<Appointment> appointments;


}