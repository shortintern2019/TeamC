package com.vegas.spotapi.controller;

import com.vegas.spotapi.model.Spot;
import com.vegas.spotapi.service.SpotService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SpotController {
    private final SpotService spotService;

    @GetMapping(path = "/spot")
    Spot findSpotInfo(@RequestParam Integer spotId) {
        return spotService.getSpotInfo(spotId);
    }
}

