package com.stook.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stook.mvc.dao.IFournisseurDao;
import com.stook.mvc.entities.Fournissuer;
import com.stook.mvc.service.IFournisseurService;

@Transactional
public class FournisseurServiceImpl implements IFournisseurService{
	
	private IFournisseurDao dao;

	
	public void setDao(IFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public Fournissuer save(Fournissuer entity) {
		return dao.save(entity);
	}

	@Override
	public Fournissuer update(Fournissuer entity) {
		return dao.update(entity);
	}

	@Override
	public List<Fournissuer> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<Fournissuer> selectAll(String sortFild, String sort) {
		return dao.selectAll(sortFild, sort);
	}

	@Override
	public Fournissuer getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Fournissuer findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Fournissuer findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
