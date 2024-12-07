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
@Entity( name = "consulting_room")
@Table( name = "consulting_room")
public class ConsultingRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer position;
    private String floor;

    @OneToMany(mappedBy = "consulting_room")
    private List<Appointment> appointments;

    public ConsultingRoom(Integer position, String floor) {
        this.position = position;
        this.floor = floor;
    }

}