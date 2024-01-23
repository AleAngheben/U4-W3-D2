package org.example.DAO;

import org.example.classes.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventoDAO {

    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

public void save(Event event){
    EntityTransaction transaction = em.getTransaction();
    transaction.begin();
    em.persist(event);
    transaction.commit();
    System.out.println("Evento : " + event.getTitle() + " creato!");
}

public Event findById(long id){
        return  em.find(Event.class, id);
}

public void findAndDeleteById(long id){

        Event found = this.findById(id);
        if(found != null){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("Evento " + found.getTitle() + " eliminato!");

        }
        else {
            System.out.println("Non ho trovato nessun evento con id : " +id);
        }

}


}
