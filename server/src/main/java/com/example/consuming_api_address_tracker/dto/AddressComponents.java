package com.example.consuming_api_address_tracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AddressComponents {
    @JsonProperty("short_name")
    private String shortName;
    @JsonProperty("long_name")
    private String longName;
    @JsonProperty("postcode_localities")
    private List<String> postcodeLocalities;
    private List<String> types;

    public String getShortName() {
        return shortName;
    }
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLongName() {
        return longName;
    }
    public void setLongName(String longName) {
        this.longName = longName;
    }

    public List<String> getPostcodeLocalities() {
        return postcodeLocalities;
    }
    public void setPostcodeLocalities(List<String> postcodeLocalities) {
        this.postcodeLocalities = postcodeLocalities;
    }

    public List<String> getTypes() {
        return types;
    }
    public void setTypes(List<String> types) {
        this.types = types;
    }
}
