package com.example.kodlama_io_devs.business.concretes;

import com.example.kodlama_io_devs.business.abstracts.ProgrammingLanguageService;
import com.example.kodlama_io_devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import com.example.kodlama_io_devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private final ProgrammingLanguageRepository programmingLanguageRepository;

    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }


    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }

    @Override
    public ProgrammingLanguage Add(ProgrammingLanguage programmingLanguage) throws Exception {
        if(programmingLanguage.getLanguageName().isEmpty()){
            throw new Exception("Programlama dili boş geçilemez!");
        }
        for(ProgrammingLanguage programmingLanguage1:getAll()){
            if(programmingLanguage1.getLanguageID() == programmingLanguage.getLanguageID()){
                throw new Exception("Programlama adı aynı olamaz!");
            }
        }
        programmingLanguageRepository.Add(programmingLanguage);
        return programmingLanguage;
    }


    @Override
    public void Delete(int LanguageID){
        programmingLanguageRepository.Delete(LanguageID);
    }

    @Override
    public void Update(ProgrammingLanguage programmingLanguage, int LanguageID) throws Exception{
        if(programmingLanguageRepository.getByID(LanguageID) == null){
            throw new Exception("Programlama dili kayıtlı değildir!!!");
        }
        programmingLanguageRepository.Update(programmingLanguage,LanguageID);
    }

    @Override
    public ProgrammingLanguage getByID(int LanguageID) throws Exception {
        return programmingLanguageRepository.getByID(LanguageID);
    }
}
