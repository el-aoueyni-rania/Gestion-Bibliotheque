package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entities.Message;


public class MessageMetierImpl implements IMessageMetier {

	@Override
	public void ajouterMessage(Message m) {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		try {
			ps = cn.prepareStatement("INSERT INTO messages (nom , prenom , mail , message ) VALUES (? , ? , ? , ? )" );
			ps.setString(1,m.getNom());
			ps.setString(2,m.getPrenom() );
			ps.setString(3,m.getMail());
			ps.setString(4,m.getMessage() );
			
		ps.executeUpdate();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

	@Override
	public List<Message> getAllMessages() {
		Connection cn = SingletonConnection.getConnection();
		PreparedStatement ps;
		List <Message> liste = new ArrayList<Message>();
		try {
			ps = cn.prepareStatement("SELECT * FROM messages ");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				Message m = new Message();
				m.setId(rs.getInt("id"));
				m.setNom(rs.getString("nom"));
				m.setPrenom(rs.getString("prenom"));
				m.setMail(rs.getString("mail"));
				m.setMessage(rs.getString("message"));
				

				liste.add(m);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return liste;
	}

}
