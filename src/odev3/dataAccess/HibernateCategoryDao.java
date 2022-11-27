package odev3.dataAccess;

import odev3.entities.Categories;

public class HibernateCategoryDao implements CategorDao{

	@Override
	public void add(Categories category) {
		System.out.println("Hibernate ile eklendi: "+category.getName());
		
	}

}
