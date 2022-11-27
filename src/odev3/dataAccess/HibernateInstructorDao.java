package odev3.dataAccess;

import odev3.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Hibernate ile eklendi: "+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

}
