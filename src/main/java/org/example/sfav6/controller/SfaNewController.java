package org.example.sfav6.controller;

import org.example.common.RootComponent;
import org.example.ebdr.common.EbdrComponent;
import org.example.sfav6.common.SfaProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SfaNewController {

    @Autowired
    SfaProperty sfaProperty;

    @Autowired
    RootComponent ebdrComponent;

    @GetMapping("/hello")
    public String hello(){
        return "Test SFA " + sfaProperty.getName() + ebdrComponent.getRootTest();
    }

}
