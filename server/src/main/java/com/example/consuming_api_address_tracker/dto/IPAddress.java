package com.example.consuming_api_address_tracker.dto;


public class IPAddress {
    private String ip;
    private Location location;
    private String[] domains;
    private AutonomousSystem as;
    private String isp;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String[] getDomains() {
        return domains;
    }

    public void setDomains(String[] domains) {
        this.domains = domains;
    }

    public AutonomousSystem getAs() {
        return as;
    }

    public void setAs(AutonomousSystem as) {
        this.as = as;
    }

    public String getIsp() {
        return isp;
    }

    public void setIsp(String isp) {
        this.isp = isp;
    }
}
