package odev3.business;

import java.util.ArrayList;

import odev3.dataAccess.CourseDao;
import odev3.entities.Course;

public class CorseManager {
	
	private CourseDao courseDao;
	
	ArrayList<Course> _courses=new ArrayList<>();

	public CorseManager(CourseDao courseDao) {
		this.courseDao = courseDao;
	}
	
	public void add(Course course) {
	    boolean	state=false;
		for (Course _course : _courses) {
			if(course.getCourseName()==_course.getCourseName() || course.getPrice()<0) {
				state=true;
				break;
			}
		}
		
		if(state==false) {
			courseDao.add(course);
			_courses.add(course);
		}
		
		
	}
	
	public void list() {
		for (Course course : _courses) {
			System.out.println(course.getCourseName());
		}
	}
	
	

}
