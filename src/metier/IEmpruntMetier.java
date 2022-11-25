package metier;

import java.util.List;


import entities.Emprunt;

public interface IEmpruntMetier {
	List <Emprunt> getAllEmprunt();
	List <Emprunt> getAllEmpruntUtilisateur(int cin);
	List <Emprunt> getAllEmpruntByMC(int mc);
	List <Emprunt> getAllEmpruntUtilisateurByMC(int mc , int cin);
	void ajouterEmprunt(Emprunt e1);
	void supprimerEmprunt(int id);
	
	
	

}
