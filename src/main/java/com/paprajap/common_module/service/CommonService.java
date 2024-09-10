package com.paprajap.common_module.service;

import org.springframework.stereotype.Service;

@Service
public class CommonService {

    public String getCommonValue(){
        return "From Common Module Service :: ";
    }
}
