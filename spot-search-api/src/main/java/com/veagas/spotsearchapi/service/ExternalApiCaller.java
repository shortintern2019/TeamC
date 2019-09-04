package com.veagas.spotsearchapi.service;

import com.veagas.spotsearchapi.modeldto.Geolocation;
import com.veagas.spotsearchapi.modeldto.Search;
import com.veagas.spotsearchapi.repository.SpotEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import LocationIq.*;
import LocationIq.auth.*;
import com.locationiq.client.model.*;
import com.locationiq.client.api.BalanceApi;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.net.URL;
import java.util.*;

@Service
@RequiredArgsConstructor
public class ExternalApiCaller {
    private static final String URL = "https://us1.locationiq.com/v1/search.php?key=pk.ecb515c78b70a996462a924812860e2a&q={keyWord}&format=json";
    private final RestTemplate restTemplate;

    public Geolocation findGeolocationByKeyWord(String keyWord) {
       return restTemplate.getForObject(URL, Geolocation.class, keyWord);
    }
}
