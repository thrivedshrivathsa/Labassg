package lab.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import lab.entity.Author;

public class UpdateAuthorDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Author author = new Author();
		//author.setAuthorId(1);
		author.setFirstName("Sai");
		author.setMiddleName("Vardhan");
		author.setLastName("Basina");
		author.setPhoneNo("8790356363");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction txn = em.getTransaction();
		txn.begin();
		
		em.merge(author);	
		
		txn.commit();
		
		System.out.println("Product Updated");
		
		em.close();
		emf.close();

	}

}
