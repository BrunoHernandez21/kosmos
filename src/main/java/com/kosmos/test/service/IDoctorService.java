package com.kosmos.test.service;

import com.kosmos.test.dto.output.DoctorDto;
import org.springframework.http.ResponseEntity;

public interface IDoctorService {

    ResponseEntity<?> getAll();

    ResponseEntity<?> getById(Long id);

    ResponseEntity<?> create(DoctorDto appointment);

    ResponseEntity<?> update(Long id, DoctorDto appointment);

    ResponseEntity<?> delete(Long id);
}
