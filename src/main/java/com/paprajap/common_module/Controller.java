package com.paprajap.common_module;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public String validateSubModule(){
        return "Incoming From Sub Module";
    }
}
