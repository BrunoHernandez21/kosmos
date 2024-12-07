package com.kosmos.test.controller;

import com.kosmos.test.dto.output.ConsultingRoomDto;
import com.kosmos.test.service.IConsultingRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/room-controller")
public class ConsultingRoomController {

    @Autowired
    private IConsultingRoomService service;

    @GetMapping(value = "",produces = "application/json")
    public ResponseEntity<?> getConsultingRoom(){
        return service.getAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> getAllConsultingRoom(@PathVariable("id") Long id) {
        return service.getById(id);
    }

    @PostMapping(value = "", produces = "application/json")
    public ResponseEntity<?> createConsultingRoom(@RequestBody ConsultingRoomDto consultingRoomDto) {
        return service.create(consultingRoomDto);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> updateConsultingRoom(@PathVariable("id") Long id,@RequestBody ConsultingRoomDto consultingRoomDto) {
        return service.update(id,consultingRoomDto);
    }


    @DeleteMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> deleteConsultingRoom(@PathVariable("id") Long id) {
        return service.delete(id);
    }
}
