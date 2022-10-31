package com.example.kodlama_io_devs.dataAccess.concretes;

import com.example.kodlama_io_devs.dataAccess.abstracts.LanguageRepository;
import com.example.kodlama_io_devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguage implements LanguageRepository {
    private List<ProgrammingLanguage> programmingLanguages = new ArrayList<>();

    public InMemoryProgrammingLanguage(){
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"Sıfırdan ileri seviyeye +120 saat C#"));
        programmingLanguages.add(new ProgrammingLanguage(2,"Web Geliştirici Eğitimi +40 saat"));
        programmingLanguages.add(new ProgrammingLanguage(3,"Mobile Developer +150 saat"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public ProgrammingLanguage Add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
        return getByID(programmingLanguage.getLanguageID());
    }

    @Override
    public void Delete(int LanguageID) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages){
            if(programmingLanguage.getLanguageID() == LanguageID){
                programmingLanguages.remove(programmingLanguage);
                break;
            }
        }
    }


    @Override
    public void Update(ProgrammingLanguage programmingLanguage, int LanguageID) {
        ProgrammingLanguage programmingLanguage1 = getByID(LanguageID);
        programmingLanguage1.setLanguageName(programmingLanguage.getLanguageName());
    }

    @Override
    public ProgrammingLanguage getByID(int LanguageID) {
        for(ProgrammingLanguage programmingLanguage : programmingLanguages){
            if(programmingLanguage.getLanguageID() == LanguageID) {
                return programmingLanguage;
            }
        }
        return null;
    }
}
