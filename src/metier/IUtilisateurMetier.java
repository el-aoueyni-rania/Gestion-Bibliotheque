package metier;

import java.util.List;

import entities.Utilisateur;

public interface IUtilisateurMetier {
	void ajouterUtilisateur(Utilisateur u);
	public Utilisateur find(String mail, String pwd);
	List <Utilisateur> getAllUtilisateurs();
	List <Utilisateur> getAllUtilisateursByMC(String mc);
	void modifierUtilisateur(Utilisateur u , int cin);
	
	

}
