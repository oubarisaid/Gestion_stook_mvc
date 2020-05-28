package com.stook.mvc.service;

import java.util.List;

import com.stook.mvc.entities.Article;

public interface IArticleService {
	
	public Article save(Article entity);
	
	public Article update(Article entity);
	
	public List<Article> selectALL();
	
	public List<Article> selectAll(String sortFild, String sort);
	
	public Article getById(Long id);
	
	public void remove(Long id);
	
	public Article findOne(String paramName, Object paramValue);
	
	public Article findOne (String[] paramNames, Object[] paramValues);
	
	public int findCountBy(String paramName, String paramValue);

}
