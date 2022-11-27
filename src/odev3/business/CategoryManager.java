package odev3.business;

import java.util.ArrayList;

import odev3.core.logging.Logger;
import odev3.dataAccess.CategorDao;
import odev3.entities.Categories;

public class CategoryManager {
	
	private CategorDao categoryDao;
	private ArrayList<Logger> loggers=new ArrayList<>();
	ArrayList<Categories> _categories=new ArrayList<>();

	public CategoryManager(CategorDao categoryDao,ArrayList<Logger> loggers) {
		this.categoryDao = categoryDao;
		this.loggers=loggers;
	}
	
	public void add(Categories category) {
		
		boolean state=false;
		
		for (Categories categories : _categories) {
			if(category.getName()==categories.getName()) {
				state=true;
				System.out.println("Bu kayit zaten var.");
				break;
			}
		}
		
		if(state==false) {
			_categories.add(category);
			categoryDao.add(category);
		}
		
		for (Logger logger : loggers) {
			logger.Log();
		}
		
		
	}
	
	public void list() {
		
		for (Categories categories : _categories) {
			System.out.println(categories.getName());
		}
		
	}
	
	

}
