package odev3.dataAccess;

import odev3.entities.Instructor;

public class JdbcInsructorDao  implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("jdbc ile eklendi :"+instructor.getFirstName()+" "+instructor.getLastName());
		
	}

}
