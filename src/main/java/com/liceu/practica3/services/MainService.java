package com.liceu.practica3.services;

import com.liceu.practica3.models.Gender;
import com.liceu.practica3.models.Movie;
import com.liceu.practica3.models.Movie_cast;
import com.liceu.practica3.models.Person;
import com.liceu.practica3.repositories.MovieRepo;
import com.liceu.practica3.repositories.Movie_castRepo;
import com.liceu.practica3.repositories.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class MainService {
    @Autowired
    MovieRepo movieRepo;

    @Autowired
    PersonRepo personRepo;

    @Autowired
    Movie_castRepo movie_castRepo;

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
   public void CreateNewPerson(String name){
       Person person = new Person();
       person.setPerson_name(name);
       personRepo.save(person);
   }
   public void CreateNewMovie(String title, int budget, String homepage, String overview, Double popularity,
                              String release_date, BigInteger revenue,int runtime,String movie_status,String tagline,
                              Double vote_average,int vote_count) {

       Movie movie = new Movie();
       movie.setTitle(title);
       movie.setBudget(budget);
       movie.setHomepage(homepage);
       movie.setOverview(overview);
       movie.setPopularity(popularity);
       movie.setRelease_date(java.sql.Date.valueOf(release_date));
       movie.setRevenue(revenue);
       movie.setRuntime(runtime);
       movie.setMovie_status(movie_status);
       movie.setTagline(tagline);
       movie.setVote_average(vote_average);
       movie.setVote_count(vote_count);
       movieRepo.save(movie);
   }

   public List<Person> PersonList(){
       return personRepo.findAll();
   }

   public List<String> ObtainAllActors(String person_name){
       return movieRepo.FindAllActors(person_name);
   }

   public List<Person> ObtainListLastPersons(){
       return personRepo.obtainListPersonCreated();}

   public List<Movie> ObtainListLastMovies(){
    return movieRepo.listMovieLimit10();
}

   public List<String> ObtainAllCharacters(String character_name){
       return movieRepo.FindAllCharacters(character_name);
   }
   public List<String> ObtainAllTitles(String title){
       return movieRepo.FindAllTitles(title);
   }
   public List<String> ObtainAllDirectors(String person_name){
       return movieRepo.FindAllDirectors(person_name);
   }

   public void InsertActorInsideMovie(Movie movie, Person person, Gender gender, String character_Name ){
       Movie_cast movie_cast = new Movie_cast();
       movie_cast.setMovie(movie);
       movie_cast.setPerson(person);
       movie_cast.setGender(gender);
       movie_cast.setCharacter_name(character_Name);
       movie_castRepo.save(movie_cast);

   }
   public Movie ObtainMovie(String title){
       return movie_castRepo.getMovie(title);
   }

   public Person ObtainPerson(String person_name){
       return movie_castRepo.getPerson(person_name);
   }

   public Gender ObtainGender(Long gender_id){return movie_castRepo.getGender(gender_id);}

   public List<String> ObtainActorInsertMovie(String person_name, String title){
       return movieRepo.FindActorInsertMovie(person_name, title);
   }
}
