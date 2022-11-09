package com.example.kodlama_io_devs.webAPI;

import com.example.kodlama_io_devs.business.abstracts.SubTechnologyService;
import com.example.kodlama_io_devs.business.requests.subTechnologies.CreateSubTechnologyRequest;
import com.example.kodlama_io_devs.business.requests.subTechnologies.DeleteSubTechnologyRequest;
import com.example.kodlama_io_devs.business.requests.subTechnologies.FindByIdSubTechnologyRequest;
import com.example.kodlama_io_devs.business.requests.subTechnologies.UpdateSubTechnologyRequest;
import com.example.kodlama_io_devs.business.responses.subTechnologies.GetAllSubTechnologiesResponse;
import com.example.kodlama_io_devs.business.responses.subTechnologies.GetByIdSubTechnologyResponse;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController
public class SubTechnologyController {

    SubTechnologyService technologyService;

    @Autowired
    public SubTechnologyController(SubTechnologyService technologyService) {
        super();
        this.technologyService = technologyService;
    }

    @PostMapping("/add")
    public void add(CreateSubTechnologyRequest createSubTechnologyRequest){
        technologyService.add(createSubTechnologyRequest);
    }

    @GetMapping("/getall")
    public List<GetAllSubTechnologiesResponse> getAllSubTechnologiesResponses(){
        return technologyService.getAll();
    }
    @DeleteMapping("/delete")
    public void delete(DeleteSubTechnologyRequest deleteSubTechnologyRequest){
        technologyService.delete(deleteSubTechnologyRequest);
    }
    @PutMapping("/update")
    public void update(UpdateSubTechnologyRequest updateSubTechnologyRequest){
        technologyService.update(updateSubTechnologyRequest);
    }
    @GetMapping("/getbyid")
    public GetByIdSubTechnologyResponse getByIdSubTechnologyResponse(FindByIdSubTechnologyRequest request){
        return technologyService.getById(request);
    }




}
