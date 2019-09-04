package com.veagas.spotsearchapi.service;

import com.veagas.spotsearchapi.modeldto.Geolocation;
import com.veagas.spotsearchapi.modeldto.Search;
import com.veagas.spotsearchapi.repository.SpotEntity;
import com.veagas.spotsearchapi.repository.SpotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GeoSearch {
    private final SpotRepository spotRepository;
    private final RestTemplate restTemplate;

    public Integer findSpotId(Integer spotType, Geolocation geolocation){
        List<SpotEntity> spots = spotRepository.findAllBySpotType(spotType);
        Integer spotId = 0;
        for(SpotEntity spot : spots){
            double distance = calcDistance(geolocation.getLatitude(), geolocation.getLongitude(), spot.getLatitude(), spot.getLongitude());
            if(distance >= 3000){
                 spotId = spot.getId();
            }
        }
        return spotId;
    }

    public double calcDistance(float lat1, float long1, float lat2, float long2){
        double dist = org.apache.lucene.util.SloppyMath.haversinMeters(lat1, long1, lat2, long2);
        return dist;
    }
}
