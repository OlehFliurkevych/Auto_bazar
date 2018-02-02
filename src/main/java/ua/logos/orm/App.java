package ua.logos.orm;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 EntityManagerFactory factory=Persistence.createEntityManagerFactory("mysql");
         EntityManager em=factory.createEntityManager();
         
         
         
         
         em.getTransaction().begin();
         em.close();
         factory.close();
    }
}
