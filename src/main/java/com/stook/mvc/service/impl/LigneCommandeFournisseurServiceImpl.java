package com.stook.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stook.mvc.dao.ILigneCommandeFournisseurDao;
import com.stook.mvc.entities.LigneCommandeFournisseur;
import com.stook.mvc.service.ILigneCommandeFournisseurService;

@Transactional
public class LigneCommandeFournisseurServiceImpl implements ILigneCommandeFournisseurService{

	private ILigneCommandeFournisseurDao dao;
	
	
	
	public void setDao(ILigneCommandeFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public LigneCommandeFournisseur save(LigneCommandeFournisseur entity) {
		return dao.save(entity);
	}

	@Override
	public LigneCommandeFournisseur update(LigneCommandeFournisseur entity) {
		return dao.update(entity);
	}

	@Override
	public List<LigneCommandeFournisseur> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<LigneCommandeFournisseur> selectAll(String sortFild, String sort) {
		return dao.selectAll(sortFild, sort);
	}

	@Override
	public LigneCommandeFournisseur getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public LigneCommandeFournisseur findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public LigneCommandeFournisseur findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}
	

}
