package spring.nikitasterlit.service;


import org.springframework.beans.factory.annotation.Autowired;
import spring.nikitasterlit.model.Actor;
import spring.nikitasterlit.repository.ActorRepository;

import java.util.List;

public class ActorService {
    @Autowired
    ActorRepository actorRepository;

    Actor addActor(Actor actor){
        return actorRepository.save(actor);
    }
    void deleteBank(long id){
        Actor actor = actorRepository.findById(id).get();
        actorRepository.delete(actor);
    }
    Actor editActor(Actor actor){
        Actor actor1 = actorRepository.findById(actor.getId()).get();
        actor1.setFirstName(actor.getFirstName());
        actor1.setLastName(actor.getLastName());
        actor1.setGenre(actor.getGenre());
        return actorRepository.save(actor1);
    }
    Actor findById(long id){
        return actorRepository.findById(id).get();
    }
    List<Actor> findAll(){
     return actorRepository.findAll();
    }
}
