package no.hvl.dat108.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "Deltagere", name = "Deltager")
public class Deltager {
	private String fornavn;
	private String etternavn;
	@Id
	private int mobil;
	private String passord;
	private String salt;
	
	public Deltager() {
		
	}
	
	public Deltager(String fornavn, String etternavn, int mobil, String passord, String salt) {
		super();
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.mobil = mobil;
		this.passord = passord;
		this.salt = salt;
	}

	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	public int getMobil() {
		return mobil;
	}
	public void setMobil(int mobil) {
		this.mobil = mobil;
	}
	public String getPassord() {
		return passord;
	}
	public void setPassord(String passord) {
		this.passord = passord;
	}
	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	@Override
	public String toString() {
		return "Deltager [fornavn=" + fornavn + ", etternavn=" + etternavn + ", mobil=" + mobil + ", passord=" + passord
				+ ", salt=" + salt + "]";
	}
	
	
}
