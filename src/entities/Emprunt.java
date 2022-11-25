package entities;

public class Emprunt {
	private int id_e;
	private int cin_e;
	private String nom_e;
	private String prenom_e;
	private String titre_doc;
	private String date_emprunt;
	
	
	public Emprunt() {
		super();
	}


	public Emprunt(int id_e, int cin_e, String nom_e, String prenom_e, String titre_doc, String date_emprunt) {
		super();
		this.id_e = id_e;
		this.cin_e = cin_e;
		this.nom_e = nom_e;
		this.prenom_e = prenom_e;
		this.titre_doc = titre_doc;
		this.date_emprunt = date_emprunt;
	}


	public Emprunt(int cin_e, String nom_e, String prenom_e, String titre_doc, String date_emprunt) {
		super();
		this.cin_e = cin_e;
		this.nom_e = nom_e;
		this.prenom_e = prenom_e;
		this.titre_doc = titre_doc;
		this.date_emprunt = date_emprunt;
	}


	public int getId_e() {
		return id_e;
	}


	public void setId_e(int id_e) {
		this.id_e = id_e;
	}


	public int getCin_e() {
		return cin_e;
	}


	public void setCin_e(int cin_e) {
		this.cin_e = cin_e;
	}


	public String getNom_e() {
		return nom_e;
	}


	public void setNom_e(String nom_e) {
		this.nom_e = nom_e;
	}


	public String getPrenom_e() {
		return prenom_e;
	}


	public void setPrenom_e(String prenom_e) {
		this.prenom_e = prenom_e;
	}


	public String getTitre_doc() {
		return titre_doc;
	}


	public void setTitre_doc(String titre_doc) {
		this.titre_doc = titre_doc;
	}


	public String getDate_emprunt() {
		return date_emprunt;
	}


	public void setDate_emprunt(String date_emprunt) {
		this.date_emprunt = date_emprunt;
	}
	
	
	
	
	
	
	


}
