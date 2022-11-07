package com.example.kodlama_io_devs.business.abstracts;

import com.example.kodlama_io_devs.business.requests.subTechnologies.CreateSubTechnologyRequest;
import com.example.kodlama_io_devs.business.requests.subTechnologies.DeleteSubTechnologyRequest;
import com.example.kodlama_io_devs.business.requests.subTechnologies.FindByIdSubTechnologyRequest;
import com.example.kodlama_io_devs.business.requests.subTechnologies.UpdateSubTechnologyRequest;
import com.example.kodlama_io_devs.business.responses.subTechnologies.GetAllSubTechnologiesResponse;
import com.example.kodlama_io_devs.business.responses.subTechnologies.GetByIdSubTechnologyResponse;

import java.util.List;

public interface SubTechnologyService {
    List<GetAllSubTechnologiesResponse> getAll();
    void add(CreateSubTechnologyRequest createSubTechnologyRequest);
    void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest);
    void update(UpdateSubTechnologyRequest updateSubTechnologyRequest);
    GetByIdSubTechnologyResponse getById(FindByIdSubTechnologyRequest byIdSubTechnologyRequest);

}
