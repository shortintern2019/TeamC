package com.veagas.spotsearchapi.controller;

import com.veagas.spotsearchapi.modeldto.Geolocation;
import com.veagas.spotsearchapi.modeldto.Spot;
import com.veagas.spotsearchapi.service.ExternalApiCaller;
import com.veagas.spotsearchapi.service.GeoSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class SearchSpotController {
    private final ExternalApiCaller externalApiCaller;
    private final GeoSearch geoSearch;
    @GetMapping("/search")
    public String getSearchKeyWordAndSpotType(@RequestParam(name = "keyWord")String keyWord, @RequestParam(name = "spotType") String spotType, @RequestParam(name = "userId") Integer userId, ModelMap modelMap){
        Geolocation geolocation = externalApiCaller.findGeolocationByKeyWord(keyWord);
        List<Spot> spots = geoSearch.findSpotInfo(spotType, geolocation);
        modelMap.addAttribute("spots", spots);
        return "search_result";
    }
}
