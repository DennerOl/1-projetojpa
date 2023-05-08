package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {
/*		
		Pessoa p1 = new Pessoa(null, "Denner da silva", "Denner@gmail.com");
		Pessoa p2 = new Pessoa(null, "Darlison da silva", "Darlison@gmail.com");
		Pessoa p3 = new Pessoa(null, "Darfany da silva", "Darfany@gmail.com");
*/	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("aulajpamaven");
		EntityManager em = emf.createEntityManager();
/*	inserindo as pessoas	
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
*/	
/*		consultando uma pessoa
 * 
		Pessoa p = em.find(Pessoa.class,1);
		System.out.println(p);
		System.out.println("Pronto!!!");
*/		
		
/*Removendo uma pessoa banco de dados 
 * 		
 */
		Pessoa p = em.find(Pessoa.class, 3);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		System.out.println("Pronto!!!");
		
		em.close();
		emf.close();
	
	}
	

}
