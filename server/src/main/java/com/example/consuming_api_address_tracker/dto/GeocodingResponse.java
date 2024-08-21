package com.example.consuming_api_address_tracker.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class GeocodingResponse {
    private List<Result> results;
    private String status;

    public static class Result{
        private List<String> types;
        @JsonProperty("formatted_address")
        private String formattedAddress;
        @JsonProperty("address_components")
        private List<AddressComponents> addressComponents;
        @JsonProperty("partial_match")
        private boolean partialMatch;
        @JsonProperty("place_id")
        private String placeId;
        private Geometry geometry;

        public List<String> getTypes() {
            return types;
        }
        public void setTypes(List<String> types) {
            this.types = types;
        }

        public String getFormattedAddress() {
            return formattedAddress;
        }
        public void setFormattedAddress(String formattedAddress) {
            this.formattedAddress = formattedAddress;
        }

        public List<AddressComponents> getAddressComponents() {
            return addressComponents;
        }
        public void setAddressComponents(List<AddressComponents> addressComponents) {
            this.addressComponents = addressComponents;
        }

        public boolean isPartialMatch() {
            return partialMatch;
        }
        public void setPartialMatch(boolean partialMatch) {
            this.partialMatch = partialMatch;
        }

        public String getPlaceId() {
            return placeId;
        }
        public void setPlaceId(String placeId) {
            this.placeId = placeId;
        }

        public Geometry getGeometry() {
            return geometry;
        }
        public void setGeometry(Geometry geometry) {
            this.geometry = geometry;
        }
    }

    public List<Result> getResults() {
        return results;
    }
    public void setResults(List<Result> results) {
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
