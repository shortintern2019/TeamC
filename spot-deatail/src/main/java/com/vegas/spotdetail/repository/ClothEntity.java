package com.vegas.spotdetail.repository;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "cloth")
@Data
public class ClothEntity implements Serializable {

	@Column(name = "id")
	@Id
	Integer id;

	@Column(name = "cd_body")
	Integer cd_body;

	@Column(name = "cd_height")
	Integer cd_height;

	@Column(name = "img_link")
	String img_link;

}