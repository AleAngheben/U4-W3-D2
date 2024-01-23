package org.example;

import org.example.DAO.EventoDAO;
import org.example.classes.Event;
import org.example.classes.EventType;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4w3d2");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();
        EventoDAO ed = new EventoDAO(em);

        Event otmanParty = new Event("Luxury party", "2024-02-10", "Tema rolex", EventType.PRIVATE, 10);
        Event daniParty = new Event("Squirtles party", "2022-03-12", "pokemons party tema", EventType.PUBLIC, 30);
        Event bulbaGathering = new Event("Bulbasaur's Gathering", "2022-04-15", "A meetup for Bulbasaur fans", EventType.PUBLIC, 25);
        Event charizardConcert = new Event("Charizard Concert", "2022-05-20", "Live music with Charizard theme", EventType.PRIVATE, 50);
        Event eeveePicnic = new Event("Eevee Picnic", "2022-06-18", "A relaxed picnic with Eevee friends", EventType.PUBLIC, 40);
        Event jigglypuffKaraoke = new Event("Jigglypuff Karaoke Night", "2022-07-10", "Sing along with Jigglypuff songs", EventType.PRIVATE, 20);


        // 1 CREO
      /*  ed.save(otmanParty);
        ed.save(daniParty);
        ed.save(bulbaGathering);
        ed.save(charizardConcert);
        ed.save(eeveePicnic);
        ed.save(jigglypuffKaraoke);*/

        // 2 TROVO

       Event foundEvent= ed.findById(4);
        System.out.println("Ho trovato questo evento : " +foundEvent.getTitle());



        // 3 TROVO ED ELIMINO
ed.findAndDeleteById(2);

        em.close();
        emf.close();
    }
}
