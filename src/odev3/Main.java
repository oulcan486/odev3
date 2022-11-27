package odev3;

import java.util.ArrayList;

import odev3.business.CategoryManager;
import odev3.business.CorseManager;
import odev3.business.InstructorManager;
import odev3.core.logging.DatabaseLogger;
import odev3.core.logging.FileLogger;
import odev3.core.logging.Logger;
import odev3.core.logging.MailLogger;
import odev3.dataAccess.HibernateCategoryDao;
import odev3.dataAccess.HibernateInstructorDao;
import odev3.dataAccess.JdbcCourseDao;
import odev3.entities.Categories;
import odev3.entities.Course;
import odev3.entities.Instructor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Categories category1=new Categories(1,"Php");
		Categories category2=new Categories(2,"Java");
		Categories category3=new Categories(3,"Javascript");
		Categories category4=new Categories(4,"Ruby");
		Categories category5=new Categories(5,"Php");
		
		ArrayList<Logger> loggers=new ArrayList<>();
		loggers.add(new DatabaseLogger());
		loggers.add(new FileLogger());
		loggers.add(new MailLogger());
		
		CategoryManager categoryManager=new CategoryManager(new HibernateCategoryDao(),loggers);
		categoryManager.add(category1);
		categoryManager.add(category2);
		categoryManager.add(category3);
		categoryManager.add(category4);
		categoryManager.add(category5);
		
		
		System.out.println("*****************************eklenen kategori kayitlari**************************");
		
		categoryManager.list();
		
		Course course1=new Course(1,"php ile kodlama",1,1,2000);
		Course course2=new Course(1,"java ile kodlama",2,1,2000);
		Course course3=new Course(1,"kotlin ile kodlama",3,1,2000);
		Course course4=new Course(1,"kotlin ile kodlama",3,1,2000);
		
		CorseManager courseManager=new CorseManager(new JdbcCourseDao());
		courseManager.add(course1);
		courseManager.add(course2);
		courseManager.add(course3);
		courseManager.add(course4);
		
		
		System.out.println("*****************************eklenen kurs kayitlari**************************");
		courseManager.list();
		
		
		Instructor instructor1=new Instructor(1,"Engin","Demiroğ");
		Instructor instructor2=new Instructor(2,"Oğulcan","Gulfidan");
		
		
		InstructorManager instructormanager=new InstructorManager(new HibernateInstructorDao());
		instructormanager.add(instructor1);
		instructormanager.add(instructor2);
		System.out.println("*****************************eklenen Eğitman kayitlari**************************");
		instructormanager.list();

	}

}
