package com.vegas.spotdetail.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.vegas.spotdetail.model.Spot;
import com.vegas.spotdetail.repository.ClothEntity;
import com.vegas.spotdetail.service.ClothService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class SpotDetailController {
	 private final ClothService clothservice;

    @GetMapping("/spot")
    public String SpotDetail(@RequestParam(name="spotId", required=false, defaultValue="1") Integer spotId,
    	@RequestParam(name="userId", required=false, defaultValue="1") Integer userId ,Model model) {
    	 RestTemplate restTemplate = new RestTemplate();
        Spot spot = restTemplate.getForObject("http://localhost:8081/spot?spotId="+spotId.toString(), Spot.class);
    	 List<ClothEntity> recommendedCloth=clothservice.searchClothIdWithSpotId(spotId, userId);
        model.addAttribute("recommendedCloth",recommendedCloth);
        model.addAttribute("spot",spot);
        return "spot";
    }
    
}