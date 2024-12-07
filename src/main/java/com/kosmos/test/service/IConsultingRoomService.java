package com.kosmos.test.service;

import com.kosmos.test.dto.output.ConsultingRoomDto;
import com.kosmos.test.entity.ConsultingRoom;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IConsultingRoomService {

    ResponseEntity<?> getAll();

    ResponseEntity<?> getById(Long id);

    ResponseEntity<?> create(ConsultingRoomDto appointment);

    ResponseEntity<?> update(Long id, ConsultingRoomDto consultingRoomDto);

    ResponseEntity<?> delete(Long id);

}
