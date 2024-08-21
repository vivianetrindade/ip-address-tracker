package com.example.consuming_api_address_tracker.controllers;

import com.example.consuming_api_address_tracker.dto.IPAddress;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class IpAddressController {

    @RequestMapping("/hello")
    @ResponseBody
    private String hello() {
        return "Hello World!";
    }

    @RequestMapping("/ipAddress/{ip}")
    @ResponseBody
    private IPAddress getIpAddress(@PathVariable String ip) {
        String uri = "https://geo.ipify.org/api/v2/country,city?apiKey=at_0tJwrGqCFVz1tSISLeJe4ccfFUBD8&ipAddress=" + ip;
        RestTemplate restTemplate = new RestTemplate();

        return restTemplate.getForObject(uri, IPAddress.class);
    }
}
