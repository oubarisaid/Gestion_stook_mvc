package com.stook.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stook.mvc.dao.ICommandeFournisseurDao;
import com.stook.mvc.entities.CommandeFournissuer;
import com.stook.mvc.service.ICommandeFournisseurService;

@Transactional
public class CommandeFournisseurServiceImpl implements ICommandeFournisseurService{
	
	private ICommandeFournisseurDao dao;

	public void setDao(ICommandeFournisseurDao dao) {
		this.dao = dao;
	}

	@Override
	public CommandeFournissuer save(CommandeFournissuer entity) {
		return dao.save(entity);
	}

	@Override
	public CommandeFournissuer update(CommandeFournissuer entity) {
		return dao.update(entity);
	}

	@Override
	public List<CommandeFournissuer> selectALL() {
		return dao.selectALL();
	}

	@Override
	public List<CommandeFournissuer> selectAll(String sortFild, String sort) {
		return dao.selectAll(sortFild, sort);
	}

	@Override
	public CommandeFournissuer getById(Long id) {
		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public CommandeFournissuer findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public CommandeFournissuer findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
