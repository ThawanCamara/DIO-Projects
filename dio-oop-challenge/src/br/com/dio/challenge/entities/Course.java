package br.com.dio.challenge.entities;

public class Course extends Content {

	private int workload;
	
	public Course() {
	}
	
	public Course(String title, String description, int workload) {
		super();
		this.workload = workload;
	}
	
	public int getWorkload() {
		return workload;
	}
	
	public void setWorkload(int workload) {
		this.workload = workload;
	}

	@Override
	public String toString() {
		return "Course [title=" + getTitle() + ", description=" + getDescription() + ", workload=" + workload + "]";
	}

	@Override
	public double calcularXP() {
		return DEFAULT_XP * workload;
	}
	
}
