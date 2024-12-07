package com.kosmos.test.service.impl;

import com.kosmos.test.dto.input.CreateAppointmentDto;
import com.kosmos.test.service.IAppointmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class AppointmentServiceImpl implements IAppointmentService {

    @Override
    public ResponseEntity<?> getAll() {
        return null;
    }

    @Override
    public ResponseEntity<?> getById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> create(CreateAppointmentDto appointment) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        return null;
    }
}
