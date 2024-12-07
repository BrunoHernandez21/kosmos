package com.kosmos.test.controller;

import com.kosmos.test.dto.output.AppointmentDto;
import com.kosmos.test.dto.output.DoctorDto;
import com.kosmos.test.service.IAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/appointment")
public class AppointmentController {

    @Autowired
    private IAppointmentService service;

    @GetMapping(value = "",produces = "application/json")
    public ResponseEntity<?> getConsultingRoom(){
        return new ResponseEntity<>("no implement", HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> getAllConsultingRoom(@PathVariable("id") Long id) {
        return new ResponseEntity<>("no implement", HttpStatus.OK);
    }

    @PostMapping(value = "", produces = "application/json")
    public ResponseEntity<?> createConsultingRoom(@RequestBody AppointmentDto appointmentDto) {
        return new ResponseEntity<>("no implement", HttpStatus.OK);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> updateConsultingRoom(@PathVariable("id") Long id) {
        return new ResponseEntity<>("no implement", HttpStatus.OK);
    }


    @DeleteMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<String> deleteConsultingRoom(@PathVariable("id") Long id) {

        return new ResponseEntity<>("no implement", HttpStatus.OK);
    }

}
