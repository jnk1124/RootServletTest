package org.example.ebdr.controller;

import org.example.ebdr.common.EbdrProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EbdrController {

    @Autowired
    EbdrProperty ebdrProperty;

    @GetMapping("/hello")
    public String ebdrHello(){
        return "Hello eBDR!! " + ebdrProperty.getName();
    }


}
