package odev3.dataAccess;

import odev3.entities.Categories;

public class JdbcCategoryDao implements CategorDao{

	@Override
	public void add(Categories category) {
		System.out.println("jdbc ile eklendi: "+category.getName());
		
	}

}
