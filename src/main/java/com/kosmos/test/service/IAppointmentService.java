package com.kosmos.test.service;

import com.kosmos.test.dto.input.CreateAppointmentDto;
import com.kosmos.test.entity.Appointment;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IAppointmentService {

    ResponseEntity<?> getAll();

    ResponseEntity<?> getById(Long id);

    ResponseEntity<?> create(CreateAppointmentDto appointment);

    ResponseEntity<?> update(Long id);

    ResponseEntity<?> delete(Long id);

}
