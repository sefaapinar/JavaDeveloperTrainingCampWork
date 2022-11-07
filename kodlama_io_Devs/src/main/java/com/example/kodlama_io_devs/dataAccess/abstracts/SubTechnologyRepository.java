package com.example.kodlama_io_devs.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;


public interface SubTechnologyRepository<SubTechnology> extends JpaRepository<SubTechnology,Integer> {
}
