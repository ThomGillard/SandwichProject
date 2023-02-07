package be.technobel.thomas;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TENNIS");

        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        /*
        Joueur j = new Joueur().builder().nom("Cuerten").prenom("Gustavo").sexe('F').build();

        //ajout
        entityManager.persist(j);

        //get one
        entityManager.find(Joueur.class,1);
        System.out.println(j.getNom());

        // update
        j.setSexe('H');
        entityManager.merge(j);

        //delete
        entityManager.remove(j);
        */


        entityManager.getTransaction().commit();

        entityManagerFactory.close();
    }
}