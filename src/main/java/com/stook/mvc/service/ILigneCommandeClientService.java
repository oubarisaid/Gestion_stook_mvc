package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.LigneCommandeClient;

public interface ILigneCommandeClientService {
	public LigneCommandeClient save(LigneCommandeClient entity);
	
	public LigneCommandeClient update(LigneCommandeClient entity);
	
	public List<LigneCommandeClient> selectALL();
	
	public List<LigneCommandeClient> selectAll(String sortFild, String sort);
	
	public LigneCommandeClient getById(Long id);
	
	public void remove(Long id);
	
	public LigneCommandeClient findOne(String paramName, Object paramValue);
	
	public LigneCommandeClient findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
