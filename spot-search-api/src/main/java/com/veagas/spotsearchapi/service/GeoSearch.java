package com.veagas.spotsearchapi.service;

import com.veagas.spotsearchapi.constant.ActivityType;
import com.veagas.spotsearchapi.modeldto.Geolocation;
import com.veagas.spotsearchapi.modeldto.Spot;
import com.veagas.spotsearchapi.repository.SpotEntity;
import com.veagas.spotsearchapi.repository.SpotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class GeoSearch {
    private final SpotRepository spotRepository;
    private final RestTemplate restTemplate;

    public List<Spot> findSpotInfo(String spotType, Geolocation geolocation){
        Integer type = ActivityType.valueOf(spotType).getId();
        List<SpotEntity> spots = spotRepository.findByType(type);
        List<Spot> result = new ArrayList<>();
        String url;
        for(SpotEntity spot : spots){
            double distance = calcDistance(geolocation.getLatitude(), geolocation.getLongitude(), spot.getLatitude(), spot.getLongitude());
            if(distance >= 3000){
                 url = "http://localhost:8081/spot?spotId={" + spot.getId() + "}";
                 result.add(restTemplate.getForObject(url, Spot.class));
            }
        }
        return result;
    }

    public double calcDistance(float lat1, float long1, float lat2, float long2){
        double dist = org.apache.lucene.util.SloppyMath.haversinMeters(lat1, long1, lat2, long2);
        return dist;
    }
}
