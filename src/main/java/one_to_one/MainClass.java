package one_to_one;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class MainClass {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("demo");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et= em.getTransaction();
		
		//--------- To Save ------------
//		Charger c= new Charger();
//		c.setWatt(51);
//		Phone p = new Phone();
//		p.setBrand("samsung");
//		p.setPrice(60000);
//		p.setCharger(c);
//		
//		et.begin();
//		em.persist(c);
//		em.persist(p);
//		et.commit();
		
		//---------- to merge ----------
//		Charger c= em.find(Charger.class, 3);
//		Phone p= em.find(Phone.class, 3);
//		p.setCharger(c);
//		
//		et.begin();
//		em.merge(p);
//		et.commit();
		
		//---------- to delete phone----------
//		Phone p =em.find(Phone.class, 2);
//		et.begin();
//		em.remove(p);
//		et.commit();
		
		//---------- to delete charger ----------
//		Charger c= em.find(Charger.class, 1);
//		Phone p= em.find(Phone.class, 1);
//		p.setCharger(null);
//		et.begin();
//		em.remove(c);
//		et.commit();
		
		// ******* Cascade Type *********  
		
		// ------- Cascade Type save ------
//		Charger c= new Charger();
//		c.setWatt(49);
//		Phone p = new Phone();
//		p.setBrand("blueberry");
//		p.setPrice(40000);
//		p.setCharger(c);
//		
//		et.begin();
//		em.persist(p);
//		et.commit();
		
		// ------- Cascade Type merge ------
		
//		Charger c= em.find(Charger.class, 2);
//		Phone p = em.find(Phone.class, 4);
//		p.setCharger(c);
//		
//		et.begin();
//		em.merge(p);
//		et.commit();
		
		// ------- Cascade Type delete ------
		
//		Phone p = em.find(Phone.class, 5);
//		et.begin();
//		em.remove(p);
//		et.commit();
		
		// ******** To fetch multiple row/ object *******
		
//		Query que= em.createQuery("select p from Phone p");
//		List<Phone> phones = que.getResultList();
//		
//		for(Phone phone:phones) {
//			System.out.println(phone);
//		}
//		
		// ******** To fetch single row/ object *******
//		Query que= em.createQuery("select p from Phone p where p.id=3");
//		Phone phone = (Phone)que.getSingleResult();
//		System.out.println(phone);
		
		
		
		
	}

}
