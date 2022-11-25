package entities;

public class Document {
	private int id;
	private String titre;
	private String auteur;
	private int nbr;
	private String categorie;
	
	
	public Document(int id, String titre, String auteur, int nbr, String categorie) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.nbr = nbr;
		this.categorie = categorie;
	}
	
	public Document(String titre, String auteur, int nbr, String categorie) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.nbr = nbr;
		this.categorie = categorie;
	}

	public Document() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public int getNbr() {
		return nbr;
	}
	public void setNbr(int nbr) {
		this.nbr = nbr;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	

}
