package com.kosmos.test.repository;

import com.kosmos.test.entity.ConsultingRoom;
import com.kosmos.test.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsultingRoomRepository extends JpaRepository<ConsultingRoom, Long> {

}