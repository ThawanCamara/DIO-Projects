package br.com.dio.challenge.application;

import java.time.LocalDate;

import br.com.dio.challenge.entities.Bootcamp;
import br.com.dio.challenge.entities.Course;
import br.com.dio.challenge.entities.Dev;
import br.com.dio.challenge.entities.Mentorship;

public class Program {

	public static void main(String[] args) {
		Course course1 =  new Course();
		course1.setTitle("Java Course");
		course1.setDescription("Java course description");
		course1.setWorkload(8);
		
		Course course2 =  new Course();
		course2.setTitle("JS Course");
		course2.setDescription("JS course description");
		course2.setWorkload(4);

		Mentorship mentorship = new Mentorship();
		mentorship.setTitle("Java mentorship");
		mentorship.setDescription("Java mentorship description");
		mentorship.setData(LocalDate.now());		
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescription("Bootcamp Java Developer description");
		bootcamp.getContents().add(course1);
		bootcamp.getContents().add(course2);
		bootcamp.getContents().add(mentorship);
		
		Dev devDan = new Dev();
		devDan.setName("Dan");
		devDan.subscribeBootcamp(bootcamp);
		System.out.println("Subscribed content Dan: " + devDan.getSubscribedContent());
		System.out.println("-");
		devDan.progress();
		devDan.progress();
		System.out.println("Subscribed content Dan: " + devDan.getSubscribedContent());
		System.out.println("Completed content Dan: " + devDan.getCompletedContent());
		System.out.println("XP: " + devDan.calculateTotalXP());
		
		System.out.println("---------");
		
		Dev devJon = new Dev();
		devJon.setName("Jon");
		devJon.subscribeBootcamp(bootcamp);
		System.out.println("Subscribed content Jon: " + devJon.getSubscribedContent());
		System.out.println("-");
		devJon.progress();
		devJon.progress();
		devJon.progress();
		System.out.println("Subscribed content Jon: " + devJon.getSubscribedContent());
		System.out.println("Completed content Jon: " + devJon.getCompletedContent());
		System.out.println("XP: " + devJon.calculateTotalXP());
		
	}

}
