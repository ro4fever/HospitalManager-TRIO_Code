package com.siit.hospital_manager.model.dto;


import com.siit.hospital_manager.model.AppointmentStatus;
import com.siit.hospital_manager.model.Doctor;
import com.siit.hospital_manager.model.Patient;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Builder
public class UpdateAppointmentDto {

    private Integer id;

    private LocalDateTime date;

    private Patient patient;

    private Doctor doctor;

    private AppointmentStatus appointmentStatus;

    @NotEmpty(message = "Note can not be empty")
    private String note;

    @NotEmpty(message = "Diagnostic can not be empty")
    private String diagnostic;

    @NotEmpty(message = "Treatment can not be empty")
    private String treatment;

}
