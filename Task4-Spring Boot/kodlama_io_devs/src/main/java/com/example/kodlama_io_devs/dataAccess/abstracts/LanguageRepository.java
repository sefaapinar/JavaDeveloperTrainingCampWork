package com.example.kodlama_io_devs.dataAccess.abstracts;

import com.example.kodlama_io_devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface LanguageRepository {
    List<ProgrammingLanguage> getAll();

    public ProgrammingLanguage Add(ProgrammingLanguage programmingLanguage);
    public void Delete(int LanguageID);
    public void Update(ProgrammingLanguage programmingLanguage, int LanguageID);
    public ProgrammingLanguage getByID(int LanguageID);


}
