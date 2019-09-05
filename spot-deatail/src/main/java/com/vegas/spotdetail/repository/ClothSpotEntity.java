package com.vegas.spotdetail.repository;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cloth_spot")
@Data
@IdClass(ClothSpotId.class)
public class ClothSpotEntity implements Serializable {

	@Column(name = "cloth_id")
	@Id
	Integer clothId;

	@Column(name = "spot_id")
	@Id
	Integer spotId;


}