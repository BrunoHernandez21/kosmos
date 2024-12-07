package com.kosmos.test.controller;

import com.kosmos.test.dto.output.DoctorDto;
import com.kosmos.test.entity.Doctor;
import com.kosmos.test.service.IConsultingRoomService;
import com.kosmos.test.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/doctor")
public class DoctorController {

    @Autowired
    private IDoctorService service;

    @GetMapping(value = "",produces = "application/json")
    public ResponseEntity<?> getDoctor(){
        return this.service.getAll();
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> getAllDoctor(@PathVariable("id") Long id) {
        return this.service.getById(id);
    }

    @PostMapping(value = "", produces = "application/json")
    public ResponseEntity<?> createDoctor(@RequestBody DoctorDto doctorDto) {
        return this.service.create(doctorDto);
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<?> updateDoctor(@PathVariable("id") Long id, @RequestBody DoctorDto doctorDto) {
        return this.service.update(id, doctorDto);
    }


    @DeleteMapping(value = "/{id}", produces = "application/json")
    public ResponseEntity<Map<String,String>> deleteDoctor(@PathVariable("id") Long id) {
        this.service.delete(id);
        Map<String,String> response = new HashMap<>();
        response.put("message","deleted");
        return new ResponseEntity<>( response, HttpStatus.OK);
    }
}
