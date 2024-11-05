package org.example.bibliotheque;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Bibliotheque {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("demo-jpa2");
        EntityManager em = emf.createEntityManager();
        System.out.println(em);

        Livre livre = new Livre(1,"Romeo et juliette");
        em.persist(livre);
        Livre l = em.find(Livre.class,1);
        if (l != null) {
            System.out.println(l.getId()+" "+l.getNom());
        }

        em.close();
        emf.close();
    }

}
