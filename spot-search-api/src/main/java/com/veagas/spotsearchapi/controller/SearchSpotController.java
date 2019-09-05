package com.veagas.spotsearchapi.controller;

import com.veagas.spotsearchapi.modeldto.Geolocation;
import com.veagas.spotsearchapi.modeldto.Spot;
import com.veagas.spotsearchapi.service.ExternalApiCaller;
import com.veagas.spotsearchapi.service.GeoSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class SearchSpotController {
    private final ExternalApiCaller externalApiCaller;
    private final GeoSearch geoSearch;
    @GetMapping("/search")
    public String getSearchKeyWordAndSpotType(@RequestParam(name = "keyWord")String output, @RequestParam(name = "spotType", required = false, defaultValue = "1") Integer spotType, @RequestParam(name = "userId", required = false) Integer userId, ModelMap modelMap){
        Geolocation geolocation = externalApiCaller.findGeolocationByKeyWord(output);
        List<Spot> spots = geoSearch.findSpotInfo(spotType, geolocation);
        modelMap.addAttribute("spots", spots);
        return "search_result";
    }
}
