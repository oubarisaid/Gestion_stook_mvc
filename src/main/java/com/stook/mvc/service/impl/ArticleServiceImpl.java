package com.stook.mvc.service.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.stook.mvc.dao.IArticleDao;
import com.stook.mvc.entities.Article;
import com.stook.mvc.service.IArticleService;

//
@Transactional
public class ArticleServiceImpl implements IArticleService{

	private IArticleDao dao;
	
	
	public void setDao(IArticleDao dao) {
		this.dao = dao;
	}

	@Override
	public Article save(Article entity) {
		
		return dao.save(entity);
	}
	
	@Override
	public Article update(Article entity) {

		return dao.update(entity);
	}

	@Override
	public List<Article> selectALL() {

		return dao.selectALL();
	}

	@Override
	public List<Article> selectAll(String sortFild, String sort) {
		return dao.selectAll(sortFild, sort);
	}

	@Override
	public Article getById(Long id) {

		return dao.getById(id);
	}

	@Override
	public void remove(Long id) {
		dao.remove(id);
		
	}

	@Override
	public Article findOne(String paramName, Object paramValue) {
		return dao.findOne(paramName, paramValue);
	}

	@Override
	public Article findOne(String[] paramNames, Object[] paramValues) {
		return dao.findOne(paramNames, paramValues);
	}

	@Override
	public int findCountBy(String paramName, String paramValue) {
		return dao.findCountBy(paramName, paramValue);
	}

}
