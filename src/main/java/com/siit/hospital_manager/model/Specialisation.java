package com.siit.hospital_manager.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import java.util.List;

@Entity
@Table(name="specialisations")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Specialisation {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="specialisation_id")
    private Integer id;

    @NotNull(message="Specialisation name should not be null")
    @Column(name="specialisation_name", unique=true)
    private String name;

    private boolean isActive;

    @OneToMany(mappedBy = "specialisation", fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true)
    private List<Doctor> doctors;

}