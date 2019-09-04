package com.veagas.spotsearchapi.controller;

import com.veagas.spotsearchapi.modeldto.Geolocation;
import com.veagas.spotsearchapi.service.ExternalApiCaller;
import com.veagas.spotsearchapi.service.GeoSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class SearchSpotController {
    private final ExternalApiCaller externalApiCaller;
    private final GeoSearch geoSearch;
    @GetMapping("/search")
    public String getSearchKeyWordAndSpotType(@RequestParam String keyWord, Integer spotId, Integer userId){
        Geolocation geolocation = externalApiCaller.findGeolocationByKeyWord(keyWord);

        return "search_result";
    }

    @PostMapping("/search")
    public String showSearchResult(){
        return "search_result";
    }
}
