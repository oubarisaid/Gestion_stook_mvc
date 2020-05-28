package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.Vente;

public interface IVenteService {
	
	public Vente save(Vente entity);
	
	public Vente update(Vente entity);
	
	public List<Vente> selectALL();
	
	public List<Vente> selectAll(String sortFild, String sort);
	
	public Vente getById(Long id);
	
	public void remove(Long id);
	
	public Vente findOne(String paramName, Object paramValue);
	
	public Vente findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
