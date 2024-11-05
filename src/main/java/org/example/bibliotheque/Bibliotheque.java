package org.example.bibliotheque;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Bibliotheque {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa2");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        System.out.println(em);

        Livre livre = new Livre(5,"Romeo et juliette","Shakespear");
        em.persist(livre);
        Livre l = em.find(Livre.class,5);
        if (l != null) {
            System.out.println(l);
        }
        em.close();
        emf.close();
    }

}
