package com.kosmos.test.repository;

import com.kosmos.test.entity.ConsultingRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<ConsultingRoom, Long> {

}