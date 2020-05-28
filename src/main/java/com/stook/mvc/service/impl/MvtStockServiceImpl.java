package com.stook.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stook.mvc.dao.IMvtStockDao;
import com.stook.mvc.entities.MvtStock;
import com.stook.mvc.service.IMvtStockService;

@Transactional
public class MvtStockServiceImpl  implements IMvtStockService{

	private IMvtStockDao dao;
	
	
	
	public void setDao(IMvtStockDao dao) {
		this.dao = dao;
	}

	@Override
	public MvtStock save(MvtStock entity) {
		return dao.save(entity);
	}

	@Override
	public MvtStock update(MvtStock entity) {
		return dao.update(entity);
	}

	@Override
	public List<MvtStock> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<MvtStock> selectAll(String sortFild, String sort) {
		return dao.selectAll(sortFild, sort);
	}

	@Override
	public MvtStock getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public MvtStock findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public MvtStock findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
