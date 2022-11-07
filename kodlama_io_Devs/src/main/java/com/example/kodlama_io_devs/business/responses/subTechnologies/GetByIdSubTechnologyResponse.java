package com.example.kodlama_io_devs.business.responses.subTechnologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdSubTechnologyResponse {
    int id;
    String name;
    String programmingLanguage;
}
