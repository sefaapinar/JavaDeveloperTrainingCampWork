package com.example.kodlama_io_devs.webApi;


import com.example.kodlama_io_devs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlama_io_devs.entities.concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguage")
public class ProgrammingLanguageController {
    private final ProgrammingLanguageService programmingLanguageService;


    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/getAll")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }

    @GetMapping("/{id}")
    public ProgrammingLanguage getByID(@PathVariable() int languageID) throws Exception{
        return programmingLanguageService.getByID(languageID);
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception{
        programmingLanguageService.Add(programmingLanguage);
    }
    @DeleteMapping("/delete")
    public void delete(@PathVariable(name = "languageID") int languageID) throws Exception{
        programmingLanguageService.Delete(languageID);
    }
    @PutMapping("/update")
    public void update(@RequestBody ProgrammingLanguage programmingLanguage,@PathVariable int languageID) throws Exception{
        programmingLanguageService.Update(programmingLanguage,languageID);
    }



}
