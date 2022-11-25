package metier;

import java.util.List;

import entities.Document;

public interface IDocumentMetier {
	List <Document> getAllDocuments();
	List <Document> getAllDocumentsElec();
	List <Document> getAllDocumentsMec();
	List <Document> getAllDocumentsProc();
	List <Document> getAllDocumentsCom();
	List <Document> getAllDocumentsAutre();
	
	List <Document> getAllDocumentsInfoByMC(String mc);
	List <Document> getAllDocumentsElecByMC(String mc);
	List <Document> getAllDocumentsMecByMC(String mc);
	List <Document> getAllDocumentsComByMC(String mc);
	List <Document> getAllDocumentsProcByMC(String mc);
	List <Document> getAllDocumentsAutreByMC(String mc);
	void ajouterDocument(Document d);

}
