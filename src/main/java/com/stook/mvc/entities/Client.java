package com.stook.mvc.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Client implements Serializable{


	@Id
	@GeneratedValue
	private Long idClient;

	private String nom;

	private String prenom;

	private String adress;

	private String photo;

	private String mail;

	@OneToMany(mappedBy = "client")
	private List<CommandeClient> listCommandeClient;

	public Client() {
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public List<CommandeClient> getListCommandeClient() {
		return listCommandeClient;
	}

	public void setListCommandeClient(List<CommandeClient> listCommandeClient) {
		this.listCommandeClient = listCommandeClient;
	}






}
