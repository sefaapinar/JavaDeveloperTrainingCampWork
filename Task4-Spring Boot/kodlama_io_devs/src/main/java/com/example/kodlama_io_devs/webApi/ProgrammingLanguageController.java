package com.example.kodlama_io_devs.webApi;


import com.example.kodlama_io_devs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlama_io_devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getAll")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }

}
