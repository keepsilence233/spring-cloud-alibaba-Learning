package cn.wenzi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/server")
public class ProviderController {

    @Value("${server.port}")
    private String port;

    @GetMapping(value = "/getPort")
    public String getPort() {
        return port;
    }

}
