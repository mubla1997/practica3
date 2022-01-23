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
   public void CreatePerson(Long person_id, String person_name){
       Person person1 = new Person();
       person1.setPerson_id(person_id);
       person1.setPerson_name(person_name);
       personRepo.save(person1);
   }
   public List<Person> PersonList(){
       return personRepo.findAll();
   }
}
