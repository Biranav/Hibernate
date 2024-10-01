package product;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class ProductDriver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		//***** To Save ********
//		ProductHibernate p1= new ProductHibernate();
//		p1.setBrand("realme");
//		p1.setPrice(15000);
//		
//		et.begin();
//		em.persist(p1);
//		et.commit();
		
		// ***** To fetch ********
//		ProductHibernate p1= em.find(ProductHibernate.class, 3);
//		System.out.println(p1);
		
		//***** To Update ********
//		ProductHibernate p1= em.find(ProductHibernate.class, 3);
//		p1.setBrand("vivo");
//		p1.setPrice(20000);
//		
//		et.begin();
//		em.merge(p1);
//		et.commit();
		
		//***** To Delete ********
		
		ProductHibernate p = em.find(ProductHibernate.class, 2);
		et.begin();
		em.remove(p);
		et.commit();
		
	}

}
