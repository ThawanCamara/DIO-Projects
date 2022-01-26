package br.com.dio.challenge.entities;

import java.time.LocalDate;

public class Mentorship extends Content {
	
	LocalDate data;
	
	public Mentorship(String title, String description, LocalDate data) {
		super();
		this.data = data;
	}

	public Mentorship() {
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentorship [title=" + getTitle() + 
				", description=" + getDescription() + 
				", data=" + data + "]";
	}

	@Override
	public double calcularXP() {
		return DEFAULT_XP + 20;
	}
	
}
