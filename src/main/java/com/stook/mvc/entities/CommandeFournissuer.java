package com.stook.mvc.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CommandeFournissuer implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idCommandeFournisseur;
	
	private String Code;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	@ManyToOne
	@JoinColumn (name = "idFournisseur")
	private Fournissuer fournisseur;
	
	@OneToMany(mappedBy = "commandeFournissuer")
	private List<LigneCommandeFournisseur> listLingeCommandeFournissuers;
	
	public CommandeFournissuer() {
	}

	public Long getIdCommandeFournisseur() {
		return idCommandeFournisseur;
	}

	public void setIdCommandeFournisseur(Long idCommandeFournisseur) {
		this.idCommandeFournisseur = idCommandeFournisseur;
	}

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Fournissuer getFournisseur() {
		return fournisseur;
	}

	public void setFournisseur(Fournissuer fournisseur) {
		this.fournisseur = fournisseur;
	}

	public List<LigneCommandeFournisseur> getListLingeCommandeFournissuers() {
		return listLingeCommandeFournissuers;
	}

	public void setListLingeCommandeFournissuers(List<LigneCommandeFournisseur> listLingeCommandeFournissuers) {
		this.listLingeCommandeFournissuers = listLingeCommandeFournissuers;
	}

	
}
