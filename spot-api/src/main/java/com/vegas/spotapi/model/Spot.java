package com.vegas.spotapi.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Spot implements Serializable {
    String name;
    Float latitude;
    Float longitude;
    Integer spotType;
    String description;
    List<String> images;
    String url;
}
