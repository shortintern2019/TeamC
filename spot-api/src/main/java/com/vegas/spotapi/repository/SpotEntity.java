package com.vegas.spotapi.repository;

import lombok.Data;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "spot")
@Data
public class SpotEntity implements Serializable {
    @Column(name="id_seq")
    @Id
    Integer id;

    @Column(name="name")
    String name;

    @Column(name="latitude")
    Float latitude;

    @Column(name="cd_type")
    Integer type;

    @Column(name="d_description")
    String description;

    @Column(name="url")
    String url;
}
