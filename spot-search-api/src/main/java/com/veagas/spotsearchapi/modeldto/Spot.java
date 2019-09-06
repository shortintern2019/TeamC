package com.veagas.spotsearchapi.modeldto;

import lombok.Data;

import java.util.List;

@Data
public class Spot {
    Integer spotId;
    String name;
    String spotType;
    String description;
    String url;
    List<String> images;

}
