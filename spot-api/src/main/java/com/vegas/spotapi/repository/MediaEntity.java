package com.vegas.spotapi.repository;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name="media")
@Data
public class MediaEntity implements Serializable {
    @Column(name="id")
    @Id
    Integer id;

    @Column(name="spot_id")
    Integer spotId;

    @Column(name="img_link")
    String imageLink;
}
