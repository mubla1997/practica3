package com.liceu.practica3.services;

import com.liceu.practica3.models.Movie;
import com.liceu.practica3.models.Person;
import com.liceu.practica3.repositories.MovieRepo;
import com.liceu.practica3.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    MovieRepo movieRepo;

    @Autowired
    PersonRepo personRepo;

   public List<Movie> FindAllMoviesByTitle(String title){
        return movieRepo.FindByTitle(title);
    }
   public List<Movie> FindAllMoviesByActor(String person_name){
       return movieRepo.FindByActor(person_name);
   }
   public List<Movie> FindAllMoviesByCharacter(String character_name){
       return movieRepo.FindByCharacter(character_name);
   }
   public List<Movie> FindALlMoviesByGenre(String genre_name){
       return movieRepo.FindByGenre(genre_name);
   }
   public List<Movie> FindAllMoviesByDirector(String person_name){
       return movieRepo.FindByDirector(person_name);
   }
   public void CreateNewPerson(Long id, String name){
       Person person = new Person();
       person.setPerson_id(id);
       person.setPerson_name(name);
       personRepo.save(person);
   }
   public List<Person> PersonList(){
       return personRepo.findAll();
   }

   public Person ObtainMaxIdPerson(){ return personRepo.obtainMaxId();}
}
