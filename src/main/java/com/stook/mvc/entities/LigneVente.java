package com.stook.mvc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneVente implements Serializable{

	@Id
	@GeneratedValue
	private Long idLigneVente;

	private Article article;


	@ManyToOne 
	@JoinColumn(name = "idVente")
	private Vente vente;


	public LigneVente() {
	}

	public Long getIdLigneVente() {
		return idLigneVente;
	}


	public void setIdLigneVente(Long idLigneVente) {
		this.idLigneVente = idLigneVente;
	}


	public Article getArticle() {
		return article;
	}


	public void setArticle(Article article) {
		this.article = article;
	}


	public Vente getVente() {
		return vente;
	}

	public void setVente(Vente vente) {
		this.vente = vente;
	}	

}
