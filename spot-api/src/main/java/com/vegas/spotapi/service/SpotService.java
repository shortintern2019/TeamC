package com.vegas.spotapi.service;

import com.vegas.spotapi.model.Spot;
import com.vegas.spotapi.repository.MediaEntity;
import com.vegas.spotapi.repository.MediaRepository;
import com.vegas.spotapi.repository.SpotEntity;
import com.vegas.spotapi.repository.SpotRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SpotService {
    private final SpotRepository spotRepository;
    private final MediaRepository mediaRepository;

    public Spot getSpotInfo(Integer spotId){
        Optional<SpotEntity> spotOpt = spotRepository.findById(spotId);
        List<MediaEntity> mediaList = mediaRepository.findBySpotId(spotId);
        if (spotOpt.isPresent()){
            SpotEntity spotEntity = spotOpt.get();
            Spot spot = new Spot();
            spot.setName(spotEntity.getName());
            spot.setLatitude(spotEntity.getLatitude());
            spot.setSpotType(spotEntity.getType());
            spot.setDescription(spotEntity.getDescription());
            spot.setUrl(spotEntity.getUrl());
            spot.setImages(mediaList.stream()
                                    .map(media->media.getImageLink())
                                    .collect(Collectors.toList()));
            return spot;
        }
        return null;
    }
}
