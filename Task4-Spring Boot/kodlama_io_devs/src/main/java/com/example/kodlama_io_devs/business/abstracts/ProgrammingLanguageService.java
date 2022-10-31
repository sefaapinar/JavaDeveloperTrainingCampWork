package com.example.kodlama_io_devs.business.abstracts;

import com.example.kodlama_io_devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();
    void Add(ProgrammingLanguage programmingLanguage) throws Exception;
    void Delete(int LanguageID);
    void Update(ProgrammingLanguage programmingLanguage, int LanguageID);
    ProgrammingLanguage getByID(int LanguageID);
}
