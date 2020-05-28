package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.Category;

public interface ICategoryService {
	public Category save(Category entity);
	
	public Category update(Category entity);
	
	public List<Category> selectALL();
	
	public List<Category> selectAll(String sortFild, String sort);
	
	public Category getById(Long id);
	
	public void remove(Long id);
	
	public Category findOne(String paramName, Object paramValue);
	
	public Category findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
