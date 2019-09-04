package com.veagas.spotsearchapi.repository;

import javax.persistence.Column;
import java.io.Serializable;

public class SpotEntity implements Serializable {
    @Column(name = "id_seq")
    Integer id;

    @Column(name = "name")
    String name;

    @Column(name = "latitude")
    Float latitude;

    @Column(name = "longitude")
    Float longitude;

    @Column(name = "cd_type")
    Float type;

    @Column(name = "d_description")
    String description;

    @Column(name = "url")
    String url;
}
