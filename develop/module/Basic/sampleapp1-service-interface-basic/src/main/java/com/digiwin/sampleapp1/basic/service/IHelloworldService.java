package com.digiwin.sampleapp1.basic.service;

import com.digiwin.app.service.AllowAnonymous;
import com.digiwin.app.service.DWService;

public interface IHelloworldService extends DWService {
    @AllowAnonymous
    public String get(String name) throws Exception;
}
