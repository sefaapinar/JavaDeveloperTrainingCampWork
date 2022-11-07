package com.example.kodlama_io_devs.business.responses.subTechnologies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllSubTechnologiesResponse {
    int id;
    String name;
    String programmingLanguageName;
}
