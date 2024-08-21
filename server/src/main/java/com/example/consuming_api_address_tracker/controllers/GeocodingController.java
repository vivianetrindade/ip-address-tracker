package com.example.consuming_api_address_tracker.controllers;

import com.example.consuming_api_address_tracker.dto.GeocodingResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class GeocodingController {

    @RequestMapping("/geocoding")
    @ResponseBody
    private GeocodingResponse getGeocoding() {
        String uri = "https://maps.googleapis.com/maps/api/geocode/json?latlng=40.714224,-73.961452&key=";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, GeocodingResponse.class);
    }
}
