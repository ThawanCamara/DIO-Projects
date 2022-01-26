package br.com.dio.challenge.entities;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	
	private String name;
	private String description;
	private LocalDate initialDate = LocalDate.now();
	private LocalDate finalDate = initialDate.plusDays(45);
	private Set<Dev> subscribedDevs = new HashSet<>();
	private Set<Content> contents = new LinkedHashSet<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getInitialDate() {
		return initialDate;
	}
	public void setInitialDate(LocalDate initialDate) {
		this.initialDate = initialDate;
	}
	public LocalDate getFinalDate() {
		return finalDate;
	}
	public void setFinalDate(LocalDate finalDate) {
		this.finalDate = finalDate;
	}
	public Set<Dev> getSubscribedDevs() {
		return subscribedDevs;
	}
	public void setSubscribedDevs(Set<Dev> subscribedDevs) {
		this.subscribedDevs = subscribedDevs;
	}
	public Set<Content> getContents() {
		return contents;
	}
	public void setContents(Set<Content> contents) {
		this.contents = contents;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contents, description, finalDate, initialDate, name, subscribedDevs);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		return Objects.equals(contents, other.contents) && Objects.equals(description, other.description)
				&& Objects.equals(finalDate, other.finalDate) && Objects.equals(initialDate, other.initialDate)
				&& Objects.equals(name, other.name) && Objects.equals(subscribedDevs, other.subscribedDevs);
	}	
}
