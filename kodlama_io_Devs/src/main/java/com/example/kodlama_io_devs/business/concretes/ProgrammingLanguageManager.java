package com.example.kodlama_io_devs.business.concretes;

import com.example.kodlama_io_devs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.CreateProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.DeleteProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.FindByIdProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.requests.programmingLanguages.UpdateProgrammingLanguageRequest;
import com.example.kodlama_io_devs.business.responses.programmingLanguages.GetAllProgrammingLanguagesResponse;
import com.example.kodlama_io_devs.business.responses.programmingLanguages.GetAllProgrammingLanguagesWithSubTechnologiesResponse;
import com.example.kodlama_io_devs.business.responses.programmingLanguages.GetByIdProgrammingLanguageResponse;
import com.example.kodlama_io_devs.business.responses.subTechnologies.GetSubTechnologyOnlyName;
import com.example.kodlama_io_devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.kodlama_io_devs.dataAccess.abstracts.SubTechnologyRepository;
import com.example.kodlama_io_devs.entities.concretes.ProgrammingLanguage;
import com.example.kodlama_io_devs.entities.concretes.SubTechnology;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private final ProgrammingLanguageRepository languageRepository;
    private final SubTechnologyRepository technologyRepository;


    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository, SubTechnologyRepository subTechnologyRepository) {

        this.languageRepository = programmingLanguageRepository;
        this.technologyRepository = subTechnologyRepository;
    }

    private boolean isLanguageEmpty(String language){
        if(language == null || language.isEmpty() || language.trim().isEmpty()){
            return true;
        }
        return false;
    }

    private boolean isLanguageExisting(String language){
       return this.languageRepository.existsByName(language);

    }


    @Override
    public List<GetAllProgrammingLanguagesResponse> getAll() {
        List<ProgrammingLanguage> languages = languageRepository.findAll();
        List<GetAllProgrammingLanguagesResponse> getAllProgrammingLanguagesResponses = new ArrayList<GetAllProgrammingLanguagesResponse>();

        for(ProgrammingLanguage language : languages){
            GetAllProgrammingLanguagesResponse languagesResponse = new GetAllProgrammingLanguagesResponse();
            languagesResponse.setId(language.getId());
            languagesResponse.setName(language.getName());
            getAllProgrammingLanguagesResponses.add(languagesResponse);
        }
        return getAllProgrammingLanguagesResponses;
    }

    @Override
    public List<GetAllProgrammingLanguagesWithSubTechnologiesResponse> getAllWithSubTechnologies() {
        List<ProgrammingLanguage> languages = languageRepository.findAll();
        List<SubTechnology> technologies = technologyRepository.findAll();
        List<GetAllProgrammingLanguagesWithSubTechnologiesResponse> languagesWithSubTechnologiesResponses = new ArrayList<GetAllProgrammingLanguagesWithSubTechnologiesResponse>();

        for(ProgrammingLanguage language : languages){
            GetAllProgrammingLanguagesWithSubTechnologiesResponse getAllProgrammingLanguagesWithSubTechnologiesResponse = new GetAllProgrammingLanguagesWithSubTechnologiesResponse();
            getAllProgrammingLanguagesWithSubTechnologiesResponse.setId(language.getId());
            getAllProgrammingLanguagesWithSubTechnologiesResponse.setName(language.getName());

            List<GetSubTechnologyOnlyName> t = new ArrayList<GetSubTechnologyOnlyName>();
            for(SubTechnology technology : technologies){
                if(technology.getProgrammingLanguage().getId() == language.getId()){
                    GetSubTechnologyOnlyName subTechnologyOnlyName = new GetSubTechnologyOnlyName();
                    subTechnologyOnlyName.setName(technology.getName());
                    t.add(subTechnologyOnlyName);
                }
            }
            getAllProgrammingLanguagesWithSubTechnologiesResponse.setTechnologies(t);
            languagesWithSubTechnologiesResponses.add(getAllProgrammingLanguagesWithSubTechnologiesResponse);
        }
            return languagesWithSubTechnologiesResponses;
    }

    @Override
    public void add(CreateProgrammingLanguageRequest createProgrammingLanguageRequest) {
        ProgrammingLanguage language = new ProgrammingLanguage();
        language.setName(createProgrammingLanguageRequest.getName());

        if (!isLanguageEmpty(createProgrammingLanguageRequest.getName())
                && !isLanguageExisting(createProgrammingLanguageRequest.getName()))
            languageRepository.save(language);
    }

    @Override
    public GetByIdProgrammingLanguageResponse getById(FindByIdProgrammingLanguageRequest findByIdProgrammingLanguageRequest) {
        ProgrammingLanguage language = languageRepository.findById(findByIdProgrammingLanguageRequest.getId()).get();
        GetByIdProgrammingLanguageResponse languageResponse = new GetByIdProgrammingLanguageResponse();
        languageResponse.setId(language.getId());
        languageResponse.setName(language.getName());
        return languageResponse;
    }

    @Override
    public void delete(DeleteProgrammingLanguageRequest deleteProgrammingLanguageRequest) {
        ProgrammingLanguage language = languageRepository.findById(deleteProgrammingLanguageRequest.getId()).get();
        languageRepository.delete(language);
    }

    @Override
    public void update(UpdateProgrammingLanguageRequest updateProgrammingLanguageRequest) {
        ProgrammingLanguage language = languageRepository.findById(updateProgrammingLanguageRequest.getId()).get();

        if(!isLanguageEmpty(updateProgrammingLanguageRequest.getNewName())
        && !isLanguageExisting(updateProgrammingLanguageRequest.getNewName())) language.setName(updateProgrammingLanguageRequest.getNewName());
        languageRepository.save(language);

    }
}
