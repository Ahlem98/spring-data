package tn.enig.model ;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Produit {
	
	@Id  @GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer num ;
	private String description ;
	private float prix_achat ;
	private float prix_vente ;
	private String date ;
	private int qte ;
	@OneToOne
	@JoinColumn(name="magasin_id")
	private Mgasin magasin ;
	public Produit(Integer num, String description, float prix_achat, float prix_vente, String date, int qte,
			Mgasin magasin) {
		super();
		this.num = num;
		this.description = description;
		this.prix_achat = prix_achat;
		this.prix_vente = prix_vente;
		this.date = date;
		this.qte = qte;
		this.magasin = magasin;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrix_achat() {
		return prix_achat;
	}
	public void setPrix_achat(float prix_achat) {
		this.prix_achat = prix_achat;
	}
	public float getPrix_vente() {
		return prix_vente;
	}
	public void setPrix_vente(float prix_vente) {
		this.prix_vente = prix_vente;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public Mgasin getMagasin() {
		return magasin;
	}
	public void setMagasin(Mgasin magasin) {
		this.magasin = magasin;
	}
	@Override
	public String toString() {
		return "Produit [num=" + num + ", description=" + description + ", prix_achat=" + prix_achat + ", prix_vente="
				+ prix_vente + ", date=" + date + ", qte=" + qte + ", magasin=" + magasin + "]";
	}
	

} 
