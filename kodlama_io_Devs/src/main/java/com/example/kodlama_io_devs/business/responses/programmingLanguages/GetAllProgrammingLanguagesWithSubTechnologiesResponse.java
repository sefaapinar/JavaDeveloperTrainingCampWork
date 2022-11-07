package com.example.kodlama_io_devs.business.responses.programmingLanguages;

import com.example.kodlama_io_devs.business.responses.subTechnologies.GetSubTechnologyOnlyName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetAllProgrammingLanguagesWithSubTechnologiesResponse {
    int id;
    String name;
    List<GetSubTechnologyOnlyName> technologies;
}
