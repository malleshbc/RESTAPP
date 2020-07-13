package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description="All User Details")
public class User {

	private Integer Id;
	
	@Size(min=2,message="Name minimum length is 2 characters")
	@ApiModelProperty(notes="Name shoudln't be less than 2 char")
	private String name;
	
	@Future
	@ApiModelProperty(notes="Birthdate should not be in future")
	private Date birthDate;
	
	protected User() {
		
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + "]";
	}
	public User(Integer id, String name, Date birthDate) {
		super();
		Id = id;
		this.name = name;
		this.birthDate = birthDate;
	}
	
}
