package hibernatecvven.config;
 
import org.hibernate.HibernateException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.*;
import org.hibernate.service.ServiceRegistry;

 
/**
 * Wrapper pour démarrer Hibernate dans un bloc statique d'initialisation.
 * @author Documentation Hibernate
 */
public class HibernatUtil {
 
	private static final SessionFactory sessionFactory;
 
	static {
		try {
                  Configuration configuration = new Configuration();
                configuration.configure();
                ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
                configuration.getProperties()).build();
                sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		} catch (Throwable ex) {
			// Log exception!
			throw new ExceptionInInitializerError(ex);
		}
	}
 
	public static Session getSession() throws HibernateException {
		return sessionFactory.openSession();
	}
 
	/**
	 * Ferme la session Hibernate
	 * @throws HibernateException
	 */
	public static void closeSession() throws HibernateException {
		sessionFactory.close();
	}
}