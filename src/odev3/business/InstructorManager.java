package odev3.business;

import java.util.ArrayList;

import odev3.dataAccess.InstructorDao;
import odev3.entities.Instructor;

public class InstructorManager {
	
	private InstructorDao instructor;
	ArrayList<Instructor> _instructor=new ArrayList<>();

	public InstructorManager(InstructorDao instructor) {
		this.instructor = instructor;
	}
	
	public void add(Instructor instructor) {
		_instructor.add(instructor);
		this.instructor.add(instructor);
	}
	
	public void list() {
		for (Instructor instructor : _instructor) {
			System.out.println(instructor.getFirstName()+" "+instructor.getLastName());
		}
	}

}
