package com.stook.mvc.dao;

import java.util.List;

public interface IGenericDao<E> {
	
	public E save(E entity);
	
	public E update(E entity);
	
	public List<E> selectALL();
	
	public List<E> selectAll(String sortFild, String sort);
	
	public E getById(Long id);
	
	public void remove(Long id);
	
	public E findOne(String paramName, Object paramValue);
	
	public E findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
	

}
