package com.kosmos.test.service.impl;

import com.kosmos.test.dto.output.DoctorDto;
import com.kosmos.test.dto.output.ResponseMessageDTO;
import com.kosmos.test.entity.Doctor;
import com.kosmos.test.repository.DoctorRepository;
import com.kosmos.test.service.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorServiceImpl implements IDoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public ResponseEntity<?> getAll() {
        List<Doctor> consulting = this.doctorRepository.findAll();

        return ResponseEntity.ok(consulting);
    }

    @Override
    public ResponseEntity<?> getById(Long id) {
        Optional<Doctor> consulting = doctorRepository.findById(id);

        if (consulting.isEmpty()) {
            ResponseMessageDTO errorResponse = new ResponseMessageDTO("Doctor not found",false);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }

        return ResponseEntity.ok(consulting.get());
    }

    @Override
    public ResponseEntity<?> create(DoctorDto doctorDto) {
        Doctor doctor = doctorDto.toDoctor();
        Doctor newDoctor = doctorRepository.save(doctor);

        return ResponseEntity.ok(doctor);
    }

    @Override
    public ResponseEntity<?> update(Long id, DoctorDto appointment) {
        Optional<Doctor> consulting = doctorRepository.findById(id);

        if (consulting.isEmpty()) {
            ResponseMessageDTO errorResponse = new ResponseMessageDTO("Doctor not found",false);
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
        Doctor doctor = consulting.get();
        doctorRepository.save(doctor);

        return ResponseEntity.ok(doctor);
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        doctorRepository.deleteById(id);
        ResponseMessageDTO response = new ResponseMessageDTO("Doctor delete",true);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}
