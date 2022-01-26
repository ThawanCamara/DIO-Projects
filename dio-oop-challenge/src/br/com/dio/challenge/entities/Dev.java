package br.com.dio.challenge.entities;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Content> subscribedContent = new LinkedHashSet<>();
	private Set<Content> completedContent = new LinkedHashSet<>();
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Content> getSubscribedContent() {
		return subscribedContent;
	}

	public void setSubscribedContent(Set<Content> subscribedContent) {
		this.subscribedContent = subscribedContent;
	}

	public Set<Content> getCompletedContent() {
		return completedContent;
	}

	public void setCompletedContent(Set<Content> completedContent) {
		this.completedContent = completedContent;
	}

	public void subscribeBootcamp(Bootcamp bootcamp) {
		
	}
	
	public void progress() {
		
	}
	
	public void calculateTotal() {
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(completedContent, name, subscribedContent);
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
		return Objects.equals(completedContent, other.completedContent) && Objects.equals(name, other.name)
				&& Objects.equals(subscribedContent, other.subscribedContent);
	}
	
}
