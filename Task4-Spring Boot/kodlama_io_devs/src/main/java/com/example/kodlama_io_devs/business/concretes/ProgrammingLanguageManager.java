package com.example.kodlama_io_devs.business.concretes;

import com.example.kodlama_io_devs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlama_io_devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.kodlama_io_devs.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository){
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public void Add(ProgrammingLanguage programmingLanguage) throws Exception{
    if(!programmingLanguage.getLanguageName().isEmpty()){
        for(int i =0; i<programmingLanguageRepository.getAll().size(); i++){
            if(programmingLanguageRepository.getAll().get(i).getLanguageName().equalsIgnoreCase(programmingLanguage.getLanguageName())){
                throw new Exception("Programlama Dil Adı Tekrar Edemez!.");
            }
        }
    }
    }

    @Override
    public void Delete(int LanguageID) {
        programmingLanguageRepository.Delete(LanguageID);
    }

    @Override
    public void Update(ProgrammingLanguage programmingLanguage, int LanguageID) {
        programmingLanguageRepository.Update(programmingLanguage,LanguageID);
    }

    @Override
    public ProgrammingLanguage getByID(int LanguageID) {
        return programmingLanguageRepository.getByID(LanguageID);
    }
}
