package com.example.kodlama_io_devs.business.abstracts;

import com.example.kodlama_io_devs.business.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.FindByIdProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.UpdateProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.responses.programmingLanguages.GetAllProgrammingLanguagesResponse;
import com.example.kodlama_io_devs.business.responses.programmingLanguages.GetAllProgrammingLanguagesWithSubTechnologiesResponse;
import com.example.kodlama_io_devs.business.responses.programmingLanguages.GetByIdProgrammingLanguageResponse;

import java.util.List;

public interface ProgrammingLanguageService {

    List<GetAllProgrammingLanguagesResponse> getAll();
    List<GetAllProgrammingLanguagesWithSubTechnologiesResponse> getAllWithSubTechnologies();
    void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest);
    GetByIdProgrammingLanguageResponse getById(FindByIdProgrammingLanguageRequest findByIdProgrammingLanguageRequest);
    void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest);
    void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest);

}
