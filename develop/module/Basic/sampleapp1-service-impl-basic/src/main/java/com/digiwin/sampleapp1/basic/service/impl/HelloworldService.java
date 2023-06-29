package com.digiwin.sampleapp1.basic.service.impl;

import com.digiwin.sampleapp1.basic.service.IHelloworldService;

public class HelloworldService implements IHelloworldService {

    @Override
    public String get(String name) throws Exception {
        return name +", Hello world!";
    }
}
