package com.example.kodlama_io_devs.webAPI;

import com.example.kodlama_io_devs.business.abstracts.SubTechnologyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class SubTechnologyController {

    SubTechnologyService technologyService;

    @Autowired
    public SubTechnologyController(SubTechnologyService technologyService) {
        super();
        this.technologyService = technologyService;
    }


}
