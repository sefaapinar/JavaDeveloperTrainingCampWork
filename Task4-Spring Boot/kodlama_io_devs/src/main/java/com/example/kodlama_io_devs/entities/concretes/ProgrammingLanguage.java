package com.example.kodlama_io_devs.entities.concretes;

public class ProgrammingLanguage {
    private int languageID;
    private String languageName;

    public ProgrammingLanguage(){

    }

    public ProgrammingLanguage(int languageID,String languageName) {
        this.languageID = languageID;
        this.languageName = languageName;
    }

    public int getLanguageID() {
        return languageID;
    }

    public void setLanguageID(int languageID) {
        this.languageID = languageID;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }


}
