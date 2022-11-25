package metier;

import java.util.List;

import entities.Message;

public interface IMessageMetier {
	void ajouterMessage(Message m);
	List <Message> getAllMessages();
}
