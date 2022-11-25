package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Utilisateur;

public class UtilisateurMetierImpl implements IUtilisateurMetier {

	
	
	
	
	@Override
	public void ajouterUtilisateur(Utilisateur u) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("INSERT INTO utilisateurs (cin , nom , prenom , genre , tel , adresse , date_naiss , mail , pwd , role) VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? , ?)" );
			
			ps.setInt(1,u.getCin());
			ps.setString(2,u.getNom() );
			ps.setString(3,u.getPrenom() );
			ps.setString(4,u.getGenre() );
			ps.setInt(5,u.getTel() );
		    ps.setString(6,u.getAdresse() );
		    ps.setString(7,u.getDate() );
			ps.setString(8,u.getMail()  );
			ps.setString(9,u.getPwd() );
			ps.setString(10,u.getRole()  );
	
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	@Override
	public Utilisateur find(String mail, String pwd) {
		Connection conn=SingletonConnection.getConnection();
		Utilisateur utilisateur =null;
		try {
			PreparedStatement ps = conn.prepareStatement
					("SELECT * FROM utilisateurs where mail = ? and pwd = ? ");
			ps.setString(1, mail);
			ps.setString(2, pwd);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			  {
				utilisateur=map(rs);
	          }

        } catch (SQLException e) 
	     {
		   e.printStackTrace();
	     }
       return utilisateur;
	}
	
	private static Utilisateur map(ResultSet rs) throws SQLException {
		Utilisateur utilisateur = new Utilisateur();
		
		utilisateur.setCin(rs.getInt("cin"));
		utilisateur.setNom(rs.getString("nom"));
		utilisateur.setPrenom(rs.getString("prenom"));
		utilisateur.setGenre(rs.getString("genre"));
		utilisateur.setTel(rs.getInt("tel"));
		utilisateur.setAdresse(rs.getString("adresse"));
		utilisateur.setDate(rs.getString("date_naiss"));
		utilisateur.setMail(rs.getString("mail"));
		utilisateur.setRole(rs.getString("role"));
		utilisateur.setPwd(rs.getString("pwd"));
		
		return utilisateur;
	}
	
	
	@Override
	public List<Utilisateur> getAllUtilisateurs() {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Utilisateur> liste = new ArrayList<Utilisateur>();
		try {
			ps = cn.prepareStatement("SELECT * FROM utilisateurs ");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Utilisateur u = new Utilisateur();
				u.setCin(rs.getInt("cin"));
				u.setNom(rs.getString("nom"));
				u.setPrenom(rs.getString("prenom"));
				u.setGenre(rs.getString("genre"));
				u.setTel(rs.getInt("tel"));
				u.setAdresse(rs.getString("adresse"));
				u.setDate(rs.getString("date_naiss"));
				u.setMail(rs.getString("mail"));
				u.setPwd(rs.getString("pwd"));
				u.setRole(rs.getString("role"));

				liste.add(u);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public List<Utilisateur> getAllUtilisateursByMC(String mc) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Utilisateur> liste = new ArrayList<Utilisateur>();
		try {
			ps = cn.prepareStatement("SELECT * FROM utilisateurs WHERE prenom LIKE ? ");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Utilisateur u = new Utilisateur();
				u.setCin(rs.getInt("cin"));
				u.setNom(rs.getString("nom"));
				u.setPrenom(rs.getString("prenom"));
				u.setGenre(rs.getString("genre"));
				u.setTel(rs.getInt("tel"));
				u.setAdresse(rs.getString("adresse"));
				u.setDate(rs.getString("date_naiss"));
				u.setMail(rs.getString("mail"));
				u.setPwd(rs.getString("pwd"));
				u.setRole(rs.getString("role"));

				liste.add(u);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}



	@Override
	public void modifierUtilisateur(Utilisateur u, int cin) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("UPDATE utilisateurs SET cin=? , nom=? , prenom=? , genre=? , tel=? , adresse=? , date_naiss=? , mail=? , pwd=? , role=? WHERE cin=?");
			
			
			ps.setInt(1,u.getCin());
			ps.setString(2,u.getNom() );
			ps.setString(3,u.getPrenom() );
			ps.setString(4,u.getGenre() );
			ps.setInt(5,u.getTel() );
		    ps.setString(6,u.getAdresse() );
		    ps.setString(7,u.getDate() );
			ps.setString(8,u.getMail()  );
			ps.setString(9,u.getPwd() );
			ps.setString(10,u.getRole()  );
			ps.setInt(11,u.getCin());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}




	


}
