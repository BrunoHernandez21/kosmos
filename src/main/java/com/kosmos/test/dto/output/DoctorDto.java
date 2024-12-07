package com.kosmos.test.dto.output;

import com.kosmos.test.entity.Doctor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DoctorDto {

    private String name;
    private String first_last_name;
    private String second_last_name;
    private String specialty;

    public Doctor toDoctor(){
        return new Doctor(this.name,this.first_last_name,this.second_last_name,this.specialty);
    }
}
