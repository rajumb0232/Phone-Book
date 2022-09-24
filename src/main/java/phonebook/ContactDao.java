package phonebook;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Component;


@Component
public class ContactDao {
   
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("raju");
    EntityManager em=emf.createEntityManager();
    EntityTransaction et=em.getTransaction();
    
    public void saveContact(Contact c) {
    	et.begin();
    	em.persist(c);
    	et.commit();
    }
    
    public List<Contact> getAllContacts(){
    	Query q = em.createQuery("select c from Contact c" , Contact.class) ;
    	List<Contact> l=q.getResultList();
    	return l;
    }
    
    public Contact update(int id) {
    	Contact c = em.find(Contact.class,id) ;
    	return c ;
    }
    
 public void updateUser(Contact c) {
    	
    	et.begin();
    	em.merge(c) ;
    	et.commit();
    }
    
    public void deleteUser(int id) {
    	Contact c = em.find(Contact.class, id );
    	et.begin();
    	em.remove(c);
    	et.commit();
    }
}
