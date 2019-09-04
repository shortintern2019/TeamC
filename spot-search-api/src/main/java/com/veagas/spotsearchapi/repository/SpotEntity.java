package com.veagas.spotsearchapi.repository;

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
    @Id
    @Column(name = "id_seq")
    Integer id;

    @Column(name = "latitude")
    Float latitude;

    @Column(name = "longitude")
    Float longitude;

    @Column(name = "cd_type")
    Float type;

}
