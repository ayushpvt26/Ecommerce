package org.lazE.EcommerceBackend.dao;

import java.util.List;

import org.lazE.EcommerceBackend.dto.Category;

public interface CategoryDAO {

	List<Category> list();
	Category get(int id);
	boolean add(Category category);
	boolean update(Category category); 
	boolean delete(Category category);
	 
}