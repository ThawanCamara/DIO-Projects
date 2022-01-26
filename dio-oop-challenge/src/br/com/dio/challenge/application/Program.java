package br.com.dio.challenge.application;

import java.time.LocalDate;

import br.com.dio.challenge.entities.Course;
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
		
		System.out.println(course1);
		System.out.println(course2);
		System.out.println(mentorship);
	}

}
