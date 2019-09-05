package com.vegas.spotdetail.repository;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.IdClass;
import lombok.Data;


@Data
public class ClothSpotId implements Serializable {

	Integer clothId;
	Integer spotId;

}
