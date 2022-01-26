package br.com.dio.challenge.entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Content> subscribedContents = new LinkedHashSet<>();
	private Set<Content> completedContents = new LinkedHashSet<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getSubscribedContent() {
		return subscribedContents;
	}

	public void setSubscribedContent(Set<Content> subscribedContent) {
		this.subscribedContents = subscribedContent;
	}

	public Set<Content> getCompletedContent() {
		return completedContents;
	}

	public void setCompletedContent(Set<Content> completedContent) {
		this.completedContents = completedContent;
	}

	public void subscribeBootcamp(Bootcamp bootcamp) {
		this.subscribedContents.addAll(bootcamp.getContents());
		bootcamp.getSubscribedDevs().add(this);
	}
	
	public void progress() {
		Optional<Content> content = this.subscribedContents.stream().findFirst();
		if (content.isPresent()) {
			this.completedContents.add(content.get());
			this.subscribedContents.remove(content.get());
		}
		else {
			System.err.println("You are not subscribed to any content!");
		}
			
	}
	
	public double calculateTotalXP() {
		return this.completedContents
				.stream()
				.mapToDouble(Content::calculateXP)
				.sum();
	}

	@Override
	public int hashCode() {
		return Objects.hash(completedContents, name, subscribedContents);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(completedContents, other.completedContents) && Objects.equals(name, other.name)
				&& Objects.equals(subscribedContents, other.subscribedContents);
	}
	
}
