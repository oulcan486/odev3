package odev3.entities;

public class Course {
	
	private int id;
	private String courseName;
	private int instructorId;
	private int categoryId;
	
	private double price;

	public Course(int id, String courseName, int instructorId, int categoryId, double price) {
		
		this.id = id;
		this.courseName = courseName;
		this.instructorId = instructorId;
		this.categoryId = categoryId;
		this.price = price;
	}

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getInstructorId() {
		return instructorId;
	}

	public void setInstructorId(int instructorId) {
		this.instructorId = instructorId;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
	

}
