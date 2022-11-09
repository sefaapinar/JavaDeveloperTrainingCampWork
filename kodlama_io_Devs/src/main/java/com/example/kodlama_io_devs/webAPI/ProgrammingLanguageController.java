package com.example.kodlama_io_devs.webAPI;

import com.example.kodlama_io_devs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.FindByIdProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.UpdateProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.responses.programmingLanguages.GetAllProgrammingLanguagesResponse;
import com.example.kodlama_io_devs.business.responses.programmingLanguages.GetAllProgrammingLanguagesWithSubTechnologiesResponse;
import com.example.kodlama_io_devs.business.responses.programmingLanguages.GetByIdProgrammingLanguageResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programmingLanguages")
public class ProgrammingLanguageController {

    private ProgrammingLanguageService languageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
            super();
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<GetAllProgrammingLanguagesResponse> getAllProgrammingLanguagesResponses(){
       return languageService.getAll();
    }
    @PostMapping("/add")
    public void add(CreateProgrammingLanguageRequest languageRequest){
        languageService.add(languageRequest);
    }
    @GetMapping("/getbyid")
    public GetByIdProgrammingLanguageResponse getByIdProgrammingLanguageResponse(FindByIdProgrammingLanguageRequest byIdProgrammingLanguageRequest){
        return languageService.getById(byIdProgrammingLanguageRequest);
    }
    @DeleteMapping("/delete")
    public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest){
        languageService.delete(deleteProgrammingLanguageRequest);
    }

    @PutMapping("/update")
    public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest){
        languageService.update(updateProgrammingLanguageRequest);
    }

    @GetMapping("/getAllWithSubTechnologies")
    public List<GetAllProgrammingLanguagesWithSubTechnologiesResponse> getAllWithSubTechnologies(){
        return languageService.getAllWithSubTechnologies();
    }





}
