package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.CommandeClient;

public interface ICommandeClientService {
	public CommandeClient save(CommandeClient entity);
	
	public CommandeClient update(CommandeClient entity);
	
	public List<CommandeClient> selectALL();
	
	public List<CommandeClient> selectAll(String sortFild, String sort);
	
	public CommandeClient getById(Long id);
	
	public void remove(Long id);
	
	public CommandeClient findOne(String paramName, Object paramValue);
	
	public CommandeClient findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
