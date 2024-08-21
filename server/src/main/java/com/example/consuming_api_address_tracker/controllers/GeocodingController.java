package com.example.consuming_api_address_tracker.controllers;

import com.example.consuming_api_address_tracker.dto.GeocodingResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class GeocodingController {

    @Value("${private.google.api.key}")
    private String googleApiKey;

    @RequestMapping("/geocoding")
    @ResponseBody
    private GeocodingResponse getGeocoding() {
        String uri = String.format("https://maps.googleapis.com/maps/api/geocode/json?latlng=40.714224,-73.961452&key=%s", googleApiKey);
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, GeocodingResponse.class);
    }
}
