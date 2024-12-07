package com.kosmos.test.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity( name = "doctor")
@Table( name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String first_last_name;
    private String second_last_name;
    private String specialty;

    @OneToMany(mappedBy = "doctor")
    private List<Appointment> appointments;

    public Doctor(String name, String firstLastName, String secondLastName, String specialty) {
        this.name = name;
        this.first_last_name = firstLastName;
        this.second_last_name = secondLastName;
        this.specialty = specialty;
    }
}