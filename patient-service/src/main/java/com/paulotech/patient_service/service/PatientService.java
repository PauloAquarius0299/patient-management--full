package com.paulotech.patient_service.service;

import com.paulotech.patient_service.dto.PatientResponseDTO;
import com.paulotech.patient_service.mapper.PatientMapper;
import com.paulotech.patient_service.model.Patient;
import com.paulotech.patient_service.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatiens(){
        List<Patient> patients = patientRepository.findAll();

        return patients.stream().map(PatientMapper::toDto).toList();
    }
}
