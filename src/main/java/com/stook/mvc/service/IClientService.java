package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.Client;

public interface IClientService {

	public Client save(Client entity);
	
	public Client update(Client entity);
	
	public List<Client> selectALL();
	
	public List<Client> selectAll(String sortFild, String sort);
	
	public Client getById(Long id);
	
	public void remove(Long id);
	
	public Client findOne(String paramName, Object paramValue);
	
	public Client findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);
}
