package com.veagas.spotsearchapi.modeldto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class GeolocationList implements Serializable {
 private List<Geolocation> geolocationList;

    public GeolocationList(List<Geolocation> geolocationList) {
        this.geolocationList = geolocationList;
    }
}