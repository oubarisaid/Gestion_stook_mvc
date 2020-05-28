package com.stook.mvc.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommandeClient implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idLigneCommmandeClient;
	
	@ManyToOne
	@JoinColumn(name = "idArticle") 
	private Article article;
	
	@ManyToOne
	@JoinColumn(name = "idCommandeClient")
	private CommandeClient commandeClient;
	
	public LigneCommandeClient() {
	}

	public Long getIdLigneCommmandeClient() {
		return idLigneCommmandeClient;
	}

	public void setIdLigneCommmandeClient(Long idLigneCommmandeClient) {
		this.idLigneCommmandeClient = idLigneCommmandeClient;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeClient getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(CommandeClient commandeClient) {
		this.commandeClient = commandeClient;
	}
	
	
}
