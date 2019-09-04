package com.vegas.spotdetail.repository;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class UserEntity implements Serializable {

	@Column(name = "id_seq")
	@Id
	Integer id;

	@Column(name = "name")
	String name;

	@Column(name = "email_address")
	String emailAddress;

	@Column(name = "age")
	Integer age;

	@Column(name = "cd_body")
	Integer bodyType;

	@Column(name = "cd_height")
	Integer heightType;
}
