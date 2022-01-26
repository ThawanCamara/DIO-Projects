package br.com.dio.challenge.entities;

import java.time.LocalDate;

public class Mentorship {
	String title;
	String description;
	LocalDate data;
	
	public Mentorship(String title, String description, LocalDate data) {
		super();
		this.title = title;
		this.description = description;
		this.data = data;
	}

	public Mentorship() {
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

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentorship [title=" + title + ", description=" + description + ", data=" + data + "]";
	}
	
}
