package com.godlumen.controller;

import com.godlumen.service.TestRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerRemote {
    @Autowired
    private TestRemote testRemote;

    @RequestMapping("/test/{param}")
    public String test(@PathVariable("param") String param){
        return testRemote.test(param);
    }
}
