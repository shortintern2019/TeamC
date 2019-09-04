package com.veagas.spotsearchapi.controller;

import com.veagas.spotsearchapi.service.ExternalApiCaller;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequiredArgsConstructor
@Controller
public class SearchSpotController {
    private final ExternalApiCaller externalApiCaller;
    @GetMapping("/search")
    public String getSearchKeyWordAndSpotType(@RequestParam String keyWord, Integer spotId, Integer userId){
        //externalApiCaller.findGeolocationByKeyWord(keyWord);
        return "search_result";
    }
}
