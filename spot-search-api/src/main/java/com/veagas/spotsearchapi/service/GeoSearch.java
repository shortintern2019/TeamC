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

    public List<Spot> findSpotInfo(Integer spotType, Geolocation geolocation){
        List<SpotEntity> spots = spotRepository.findByType(spotType);
        List<Spot> result = new ArrayList<>();
        Spot spot;
        String type;
        String url;
        for(SpotEntity spotEntity : spots){
            double distance = calcDistance(geolocation.getLatitude(), geolocation.getLongitude(), spotEntity.getLatitude(), spotEntity.getLongitude());
            if(distance >= 3000){
                 url = "http://localhost:8081/spot?spotId={" + spotEntity.getId() + "}";
                 spot = restTemplate.getForObject(url, Spot.class);
                 type = ActivityType.getById(spot.getSpotType()).getName();
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
