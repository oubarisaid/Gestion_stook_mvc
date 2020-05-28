package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.CommandeFournissuer;

public interface ICommandeFournisseurService {
	public CommandeFournissuer save(CommandeFournissuer entity);
	
	public CommandeFournissuer update(CommandeFournissuer entity);
	
	public List<CommandeFournissuer> selectALL();
	
	public List<CommandeFournissuer> selectAll(String sortFild, String sort);
	
	public CommandeFournissuer getById(Long id);
	
	public void remove(Long id);
	
	public CommandeFournissuer findOne(String paramName, Object paramValue);
	
	public CommandeFournissuer findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
