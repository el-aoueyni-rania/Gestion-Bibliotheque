package entities;

public class Utilisateur {
	private int cin;
	private String nom;
	private String prenom;
	private String genre;
	private int tel;
	private String adresse;
	private String date;
	private String mail;
	private String pwd;
	private String role;
	
	
	
	
	public Utilisateur(int cin, String nom, String prenom, String genre, int tel, String adresse, String date,
			String mail, String pwd, String role) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.genre = genre;
		this.tel = tel;
		this.adresse = adresse;
		this.date = date;
		this.mail = mail;
		this.pwd = pwd;
		this.role = role;
	}
	public Utilisateur(int cin, String nom, String prenom, int tel, String adresse, String date,
			String mail) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.adresse = adresse;
		this.date = date;
		this.mail = mail;

	}
	
	public Utilisateur() {
	}
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	

}
