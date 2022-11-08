package com.example.kodlama_io_devs.business.requests.programmingLanguages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class UpdateProgrammingLanguageRequest {
    private int id;
    private String newName;
}
