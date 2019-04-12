package entitites;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaApplication {
	 public static void main(String[] args) {
	        EntityManagerFactory emf = Persistence.createEntityManagerFactory("template-persistence-unit");
	        try {
	            EntityManager em = emf.createEntityManager();
	        }finally {
	        	
	        }
	 }
}
