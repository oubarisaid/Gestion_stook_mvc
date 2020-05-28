package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.LigneVente;

public interface ILigneVenteService {
	public LigneVente save(LigneVente entity);
	
	public LigneVente update(LigneVente entity);
	
	public List<LigneVente> selectALL();
	
	public List<LigneVente> selectAll(String sortFild, String sort);
	
	public LigneVente getById(Long id);
	
	public void remove(Long id);
	
	public LigneVente findOne(String paramName, Object paramValue);
	
	public LigneVente findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
