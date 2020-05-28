package com.stook.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Fournissuer implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idFournisseur;
	
	private String nom;
	
	private String prenom;
	
	private String adress;
	
	private String photo;
	
	private String email;
	
	@OneToMany(mappedBy = "fournisseur")
	private List<CommandeFournissuer> listCommmandeFournisseur;

	public Fournissuer() {
	}
	
	

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	public List<CommandeFournissuer> getListCommmandeFournisseur() {
		return listCommmandeFournisseur;
	}

	public void setListCommmandeFournisseur(List<CommandeFournissuer> listCommmandeFournisseur) {
		this.listCommmandeFournisseur = listCommmandeFournisseur;
	}
	
	

}
