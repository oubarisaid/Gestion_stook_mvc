package com.stook.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class LigneCommandeFournisseur implements Serializable{
	
	@Id	
	@GeneratedValue
	private Long idLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn (name = "idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn (name = "idCommandeFournisseur")
	private CommandeFournissuer  commandeFournissuer;

	public LigneCommandeFournisseur() {
	}

	public Long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}

	public void setIdLigneCommandeFournisseur(Long idLigneCommandeFournisseur) {
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournissuer getCommandeFournissuer() {
		return commandeFournissuer;
	}

	public void setCommandeFournissuer(CommandeFournissuer commandeFournissuer) {
		this.commandeFournissuer = commandeFournissuer;
	}

}
