package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.MvtStock;

public interface IMvtStockService {
	
	public MvtStock save(MvtStock entity);
	
	public MvtStock update(MvtStock entity);
	
	public List<MvtStock> selectALL();
	
	public List<MvtStock> selectAll(String sortFild, String sort);
	
	public MvtStock getById(Long id);
	
	public void remove(Long id);
	
	public MvtStock findOne(String paramName, Object paramValue);
	
	public MvtStock findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
