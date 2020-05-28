package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.Utilisateur;

public interface IUtilisateurService {
	
	public Utilisateur save(Utilisateur entity);
	
	public Utilisateur update(Utilisateur entity);
	
	public List<Utilisateur> selectALL();
	
	public List<Utilisateur> selectAll(String sortFild, String sort);
	
	public Utilisateur getById(Long id);
	
	public void remove(Long id);
	
	public Utilisateur findOne(String paramName, Object paramValue);
	
	public Utilisateur findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
