package com.example.kodlama_io_devs.business.concretes;

import com.example.kodlama_io_devs.business.abstracts.SubTechnologyService;
import com.example.kodlama_io_devs.business.requests.subTechnologies.CreateSubTechnologyRequest;
import com.example.kodlama_io_devs.business.requests.subTechnologies.DeleteSubTechnologyRequest;
import com.example.kodlama_io_devs.business.requests.subTechnologies.FindByIdSubTechnologyRequest;
import com.example.kodlama_io_devs.business.requests.subTechnologies.UpdateSubTechnologyRequest;
import com.example.kodlama_io_devs.business.responses.subTechnologies.GetAllSubTechnologiesResponse;
import com.example.kodlama_io_devs.business.responses.subTechnologies.GetByIdSubTechnologyResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubTechnologyManager implements SubTechnologyService {
    @Override
    public List<GetAllSubTechnologiesResponse> getAll() {
        return null;
    }

    @Override
    public void add(CreateSubTechnologyRequest createSubTechnologyRequest) {

    }

    @Override
    public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest) {

    }

    @Override
    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest) {

    }

    @Override
    public GetByIdSubTechnologyResponse getById(FindByIdSubTechnologyRequest byIdSubTechnologyRequest) {
        return null;
    }
}
