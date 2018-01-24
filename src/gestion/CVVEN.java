package gestion;
 
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Order;


import config.*;
import java.io.Serializable;
import metier.*;
 
/**
 * Programme de vérification du fonctionnement de la persistance
 * 
 */
public class CVVEN {
 
	/**
	 * Programme principal
	 */
	public static void main(String[] args) {
		// Récupération de la session Hibernate créée dans HibernateUtil
		Session session =  HibernateUtil.getSession();
                
		// Création d'une transaction
		Transaction transaction = session.beginTransaction();
 
		//Participant p1 = new Participant("Aymard", "Jean", "MIT");
                //Participant p2 = new Participant("Joyeux", "Luron", "Lycée Descartes");
               
                
                
		// Enregistrement de ces participants dans la base Postgresql
               session.save(p1);
               session.save(p2);
                
               //Suppression d'un participant
               //p1.setNum_pers(1);
               //session.delete(p1);
                
               //Suppression d'une instance persistante (participant numéro 4 ici)
               /*
                       Serializable num_pers = 4;
                       Object persistentInstance = session.load(Participant.class, num_pers);
                       if(persistentInstance != null)
                        {
                        session.delete(persistentInstance);
                        }
                */
 
		// Validation de la transaction
		transaction.commit();
 
		// Vérification
		// Recherche dans la table de la base de données et tri sur le nom
		List<Participant> lesParticipants = session.createCriteria(Participant.class).addOrder(Order.asc("nom")).list();
 
		// Affichage du résultat de la recherche
		System.out.println("-------------------------------------------------------");
		System.out.println("La table Participant contient actuellement les éléments suivants :");
                lesParticipants.stream().forEach((unParticipant) -> {
                    System.out.println(unParticipant);
            });
		System.out.println("-------------------------------------------------------");
 
		// Fermeture de la session
		HibernateUtil.closeSession();
	}
}