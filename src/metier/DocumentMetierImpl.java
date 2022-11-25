package metier;

import java.sql.*;
import java.util.*;

import entities.Document;

public class DocumentMetierImpl implements IDocumentMetier{

	@Override
	public List<Document> getAllDocuments() {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE categorie LIKE 'informatique' ");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}
	
	@Override
	public List<Document> getAllDocumentsElec() {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE categorie LIKE 'genie electrique' ");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public List<Document> getAllDocumentsMec() {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE categorie LIKE 'genie mecanique' ");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public List<Document> getAllDocumentsProc() {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE categorie LIKE 'genie des procedes' ");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public List<Document> getAllDocumentsCom() {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE categorie LIKE 'commerce' ");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}


	@Override
	public List<Document> getAllDocumentsAutre() {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE categorie LIKE 'autre' ");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}


	@Override
	public List<Document> getAllDocumentsInfoByMC(String mc) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE (titre LIKE ? and categorie LIKE 'informatique') ");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}
	@Override
	public List<Document> getAllDocumentsElecByMC(String mc) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE (titre LIKE ? and categorie LIKE 'genie electrique') ");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public List<Document> getAllDocumentsMecByMC(String mc) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE (titre LIKE ? and categorie LIKE 'genie mecanique') ");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	
	@Override
	public List<Document> getAllDocumentsComByMC(String mc) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE (titre LIKE ? and categorie LIKE 'commerce') ");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public List<Document> getAllDocumentsProcByMC(String mc) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE (titre LIKE ? and categorie LIKE 'genie des procedes') ");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public List<Document> getAllDocumentsAutreByMC(String mc) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Document> liste = new ArrayList<Document>();
		try {
			ps = cn.prepareStatement("SELECT * FROM documents WHERE (titre LIKE ? and categorie LIKE 'autre') ");
			ps.setString(1, "%" + mc + "%");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Document d = new Document();
				d.setId(rs.getInt("id"));
				d.setTitre(rs.getString("titre"));
				d.setAuteur(rs.getString("auteur"));
				d.setNbr(rs.getInt("nbr"));
				d.setCategorie(rs.getString("categorie"));
				liste.add(d);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

	@Override
	public void ajouterDocument(Document d) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("INSERT INTO documents (titre , auteur , nbr , categorie) VALUES (? , ? , ? , ?)" );
			
			ps.setString(1, d.getTitre());
			ps.setString(2, d.getAuteur());
			ps.setInt(3, d.getNbr());
			ps.setString(4, d.getCategorie());
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

	
}
