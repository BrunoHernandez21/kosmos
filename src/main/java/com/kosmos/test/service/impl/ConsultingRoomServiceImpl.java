package com.kosmos.test.service.impl;

import com.kosmos.test.dto.output.ConsultingRoomDto;
import com.kosmos.test.dto.output.ResponseMessageDTO;
import com.kosmos.test.entity.ConsultingRoom;
import com.kosmos.test.repository.ConsultingRoomRepository;
import com.kosmos.test.service.IConsultingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultingRoomServiceImpl implements IConsultingRoomService {


    @Autowired
    private ConsultingRoomRepository consultingRoomRepository;

    @Override
    public ResponseEntity<?> getAll() {
        List<ConsultingRoom> consulting = this.consultingRoomRepository.findAll();
        return ResponseEntity.ok(consulting);
    }

    @Override
    public ResponseEntity<?> getById(Long id) {
        Optional<ConsultingRoom> consulting = consultingRoomRepository.findById(id);

        if (consulting.isEmpty()) {
            ResponseMessageDTO errorResponse = new ResponseMessageDTO("Doctor not found",false);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }

        return ResponseEntity.ok(consulting.get());
    }

    @Override
    public ResponseEntity<?> create(ConsultingRoomDto consultingRoomDto) {
        ConsultingRoom consultingRoom = consultingRoomDto.toConsultingRoom();
        ConsultingRoom newConsultingRoom = consultingRoomRepository.save(consultingRoom);

        return ResponseEntity.ok(newConsultingRoom);
    }

    @Override
    public ResponseEntity<?> update(Long id, ConsultingRoomDto consultingRoomDto) {
        Optional<ConsultingRoom> consulting = consultingRoomRepository.findById(id);

        if (consulting.isEmpty()) {
            ResponseMessageDTO errorResponse = new ResponseMessageDTO("Doctor not found",false);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }

        ConsultingRoom consultingRoom = consulting.get();
        consultingRoomRepository.save(consultingRoom);

        return ResponseEntity.ok(consultingRoom);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        consultingRoomRepository.deleteById(id);
        ResponseMessageDTO response = new ResponseMessageDTO("Doctor delete",true);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
