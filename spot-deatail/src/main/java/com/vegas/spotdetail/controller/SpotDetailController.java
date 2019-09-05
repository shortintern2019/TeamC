package com.vegas.spotdetail.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String SpotDetail(@RequestParam(name="spotid", required=false, defaultValue="1") Integer spotid,
    	@RequestParam(name="userid", required=false, defaultValue="1") Integer userid ,Model model) {
    	 RestTemplate restTemplate = new RestTemplate();
        Spot spot = restTemplate.getForObject("http://local/8081/spot?spotid="+spotid.toString(), Spot.class);
    	 List<ClothEntity> recomendCloth=clothservice.serchClothIdWithSpotId(spotid, userid);
        model.addAttribute("recomendcloth",recomendCloth);
        model.addAttribute("spot",spot);
        return "spot";
    }
    
}