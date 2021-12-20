package com.coding.book.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	@Size(min = 3, max=50 )
	private String title;
	
	@NotNull
	@Size(min = 5, max=100, message="Description should be between 5-100" )
	private String description;
	
	@NotNull
	@Size(min = 3, max=30 )
	private String language;
	
	@NotNull
	@Min(100)
	private String number_of_pages;

	@NotNull
	@Size(min = 3, max=30 )
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getNumber_of_pages() {
		return number_of_pages;
	}
	public void setNumber_of_pages(String number_of_pages) {
		this.number_of_pages = number_of_pages;
	}
	
}