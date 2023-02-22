package com.siit.hospital_manager.model.dto;


import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@RequiredArgsConstructor
public class CreateSpecialisationDto {

    @NotEmpty(message = "Specialisation name can not be empty")
    private String name;

    private Boolean isActive;

}