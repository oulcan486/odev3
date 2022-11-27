package odev3.dataAccess;

import odev3.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("jdbc ile eklendi: "+course.getCourseName());
		
	}

}
