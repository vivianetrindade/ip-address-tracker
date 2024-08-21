package com.example.consuming_api_address_tracker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Geometry {

    private LatLng location;
    @JsonProperty("location_type")
    private GeocoderLocationType locationType;
    private LatLngBounds viewport;
    private LatLngBounds bounds;

    public static class LatLng {
        private double lat;
        private double lng;

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }
    }

    public static class LatLngBounds {
        private LatLng northeast;
        private LatLng southwest;

        public LatLng getNortheast() {
            return northeast;
        }

        public void setNortheast(LatLng northeast) {
            this.northeast = northeast;
        }

        public LatLng getSouthwest() {
            return southwest;
        }

        public void setSouthwest(LatLng southwest) {
            this.southwest = southwest;
        }
    }

    public enum GeocoderLocationType {
        ROOFTOP,
        RANGE_INTERPOLATED,
        GEOMETRIC_CENTER,
        APPROXIMATE;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public GeocoderLocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(GeocoderLocationType locationType) {
        this.locationType = locationType;
    }

    public LatLngBounds getViewport() {
        return viewport;
    }

    public void setViewport(LatLngBounds viewport) {
        this.viewport = viewport;
    }

    public LatLngBounds getBounds() {
        return bounds;
    }

    public void setBounds(LatLngBounds bounds) {
        this.bounds = bounds;
    }
}

