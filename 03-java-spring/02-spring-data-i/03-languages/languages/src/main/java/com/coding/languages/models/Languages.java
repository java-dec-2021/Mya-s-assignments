package com.coding.languages.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="languages")
public class Languages {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3, max=20, message="Name should be at least 3 characters")
	private String name;
	
	@NotNull
	@Size(min = 3, max=20, message="Creator should be at least 3 characters")
	private String creator;
	
	@NotNull
	@Min(1)
//	@Size(min = 1, message="Version must be entered!")
	private Float version;
	
	public Languages() {
		
	}
	
	public Languages(Long id, String name, String creator, Float version) {
		
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.version = version;
	}
	public Long getId() {
		return id;
	}
//	public Long setId() {
//		return id;
//	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Float getVersion() {
		return version;
	}
	public void setVersion(Float version) {
		this.version = version;
	} 
	
	
}
