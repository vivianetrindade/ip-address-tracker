package com.example.consuming_api_address_tracker.dto;

public class AutonomousSystem {
    private Integer asn;
    private String name;
    private String route;
    private String domain;
    private String type;

    public Integer getAsn() {
        return asn;
    }

    public void setAsn(Integer asn) {
        this.asn = asn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
