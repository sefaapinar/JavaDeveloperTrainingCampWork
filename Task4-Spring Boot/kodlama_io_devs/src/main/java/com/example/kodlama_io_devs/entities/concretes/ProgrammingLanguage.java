package com.example.kodlama_io_devs.entities.concretes;

public class ProgrammingLanguage {
    private int languageID;
    private String languageName;

    public ProgrammingLanguage(){

    }

    public ProgrammingLanguage(int languageID,String languageName) {
        languageID = languageID;
        languageName = languageName;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        languageID = languageID;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        languageName = languageName;
    }
}
