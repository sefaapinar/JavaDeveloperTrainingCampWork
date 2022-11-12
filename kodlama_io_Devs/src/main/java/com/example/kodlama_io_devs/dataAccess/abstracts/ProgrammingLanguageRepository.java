package com.example.kodlama_io_devs.dataAccess.abstracts;

import com.example.kodlama_io_devs.entities.concretes.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage,Integer> {
    boolean existsByName(String language);
}
