package com.vegas.userapi.modeldto;

import java.io.Serializable;

import lombok.Data;

@Data
public class User implements Serializable {
	String name;
	String emailAddress;
	Integer age;
	Integer bodyType;
	Integer heightType;
}