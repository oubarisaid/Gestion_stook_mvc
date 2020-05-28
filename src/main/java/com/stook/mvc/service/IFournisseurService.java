package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.Fournissuer;

public interface IFournisseurService {
	public Fournissuer save(Fournissuer entity);
	
	public Fournissuer update(Fournissuer entity);
	
	public List<Fournissuer> selectALL();
	
	public List<Fournissuer> selectAll(String sortFild, String sort);
	
	public Fournissuer getById(Long id);
	
	public void remove(Long id);
	
	public Fournissuer findOne(String paramName, Object paramValue);
	
	public Fournissuer findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
