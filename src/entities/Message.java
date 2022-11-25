package entities;

public class Message {
	private int id;
	private String nom;
	private String prenom;
	private String mail;
	private String message;
	
	
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(int id, String nom, String prenom, String mail, String message) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.message = message;
	}
	public Message(String nom, String prenom, String mail, String message) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
