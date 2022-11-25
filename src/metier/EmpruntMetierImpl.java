package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Emprunt;


public class EmpruntMetierImpl implements IEmpruntMetier{

	@Override
	public List<Emprunt> getAllEmprunt() {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Emprunt> liste = new ArrayList<Emprunt>();
		try {
			ps = cn.prepareStatement("SELECT * FROM emprunts ");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Emprunt e = new Emprunt();
				e.setId_e(rs.getInt("id_e"));
				e.setCin_e(rs.getInt("cin_e"));
				e.setNom_e(rs.getString("nom_e"));
			    e.setPrenom_e(rs.getString("prenom_e"));
			    e.setTitre_doc(rs.getString("titre_doc"));
			    e.setDate_emprunt(rs.getString("date_emprunt"));

				liste.add(e);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public List<Emprunt> getAllEmpruntByMC(int mc) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Emprunt> liste = new ArrayList<Emprunt>();
		try {
			ps = cn.prepareStatement("SELECT * FROM emprunts WHERE cin_e LIKE ?  ");
			ps.setInt(1,  mc );
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Emprunt e1 = new Emprunt();
				e1.setId_e(rs.getInt("id_e"));
				e1.setCin_e(rs.getInt("cin_e"));
				e1.setNom_e(rs.getString("nom_e"));
			    e1.setPrenom_e(rs.getString("prenom_e"));
			    e1.setTitre_doc(rs.getString("titre_doc"));
			    e1.setDate_emprunt(rs.getString("date_emprunt"));

				liste.add(e1);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public void ajouterEmprunt(Emprunt e1) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("INSERT INTO emprunts (cin_e , nom_e , prenom_e , titre_doc , date_emprunt ) VALUES (? , ? , ? , ? , ? )" );
			
			ps.setInt(1,e1.getCin_e());
			ps.setString(2,e1.getNom_e() );
			ps.setString(3,e1.getPrenom_e() );
			ps.setString(4,e1.getTitre_doc() );
		    ps.setString(5,e1.getDate_emprunt() );
	
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void supprimerEmprunt(int id) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("DELETE From emprunts WHERE id_e=?" );
			ps.setInt(1, id);
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Emprunt> getAllEmpruntUtilisateur(int cin) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Emprunt> liste = new ArrayList<Emprunt>();
		try {
			ps = cn.prepareStatement("SELECT * FROM emprunts WHERE cin_e=? ");
			ps.setInt(1, cin);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Emprunt e = new Emprunt();
				e.setId_e(rs.getInt("id_e"));
				e.setCin_e(rs.getInt("cin_e"));
				e.setNom_e(rs.getString("nom_e"));
			    e.setPrenom_e(rs.getString("prenom_e"));
			    e.setTitre_doc(rs.getString("titre_doc"));
			    e.setDate_emprunt(rs.getString("date_emprunt"));

				liste.add(e);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public List<Emprunt> getAllEmpruntUtilisateurByMC(int mc, int cin) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Emprunt> liste = new ArrayList<Emprunt>();
		try {
			ps = cn.prepareStatement("SELECT * FROM emprunts WHERE cin_e LIKE ? and cin_e LIKE ? ");
			ps.setInt(1,  mc );
			ps.setInt(2,  cin );
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Emprunt e1 = new Emprunt();
				e1.setId_e(rs.getInt("id_e"));
				e1.setCin_e(rs.getInt("cin_e"));
				e1.setNom_e(rs.getString("nom_e"));
			    e1.setPrenom_e(rs.getString("prenom_e"));
			    e1.setTitre_doc(rs.getString("titre_doc"));
			    e1.setDate_emprunt(rs.getString("date_emprunt"));

				liste.add(e1);
			}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
}
}

