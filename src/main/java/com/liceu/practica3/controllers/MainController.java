package com.liceu.practica3.controllers;

import com.liceu.practica3.models.Movie;
import com.liceu.practica3.models.Person;
import com.liceu.practica3.services.MainService;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.math.BigInteger;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/main")
    public String main(){return "main";}

    @GetMapping("/search")
    public String search(){return "search";}

    @GetMapping("/create")
    public String create(){return "create";}

    @GetMapping("/edit")
    public String edit(){return "edit";}

    @GetMapping("/delete")
    public String delete(){return "delete";}

    @GetMapping("/moviesT")
    public String movies(Model model, @RequestParam(required = false) String title ){
        List <Movie> movies = mainService.FindAllMoviesByTitle(title);
        model.addAttribute("movies", movies);
        return "moviesTitle";
    }
    @GetMapping("/moviesA")
    public String moviesByActor(Model model,@RequestParam(required = false) String person_name ) {
        List <Movie> movies = mainService.FindAllMoviesByActor(person_name);
        model.addAttribute("movies", movies);
        return "moviesActor";
    }
    //Autocompletado
    @GetMapping(value = "/getActors",produces = {"application/json"})
    public @ResponseBody List<String> getActors(@RequestParam(required = false) String term ){
    List<String> actors = mainService.ObtainAllActors(term);
    return actors;
    }

    @GetMapping("/moviesC")
    public String moviesByCharacter(Model model,@RequestParam(required = false) String character_name ) {
        List <Movie> movies = mainService.FindAllMoviesByCharacter(character_name);
        model.addAttribute("movies", movies);
        return "moviesCharacter";
    }
    @GetMapping("/moviesG")
    public String moviesByGenre(Model model,@RequestParam(required = false) String genre_name ) {
        List <Movie> movies = mainService.FindALlMoviesByGenre(genre_name);
        model.addAttribute("movies", movies);
        return "moviesGenre";
    }
    @GetMapping("/moviesD")
    public String moviesByDirector(Model model,@RequestParam(required = false) String person_name ) {
        List <Movie> movies = mainService.FindAllMoviesByDirector(person_name);
        model.addAttribute("movies", movies);
        return "moviesDirector";
    }

    @GetMapping("/createActor")
    public String createActorGet(){
        return "createdPersons";
    }

    @PostMapping("/createActor")
    public String createActorPost(Model model,@RequestParam(required = false) String person_name) {

        mainService.CreateNewPerson(person_name);
        List<Person> persons = mainService.ObtainListLastPersons();
        model.addAttribute("persons", persons);
        return "createdPersons";
    }

    @GetMapping("/createMovie")
        public String createMovieGet(){
            return "createMovie";
    }
    @PostMapping("/createMovie")
    public String createMoviePost(Model model,@RequestParam(required = false) String title,
                                  @RequestParam(required = false) int budget,
                                  @RequestParam(required = false) String homepage,
                                  @RequestParam(required = false) String overview,
                                  @RequestParam(required = false) Double popularity,
                                  @RequestParam(required = false) String release_date,
                                  @RequestParam(required = false) BigInteger revenue,
                                  @RequestParam(required = false) int runtime,
                                  @RequestParam(required = false) String movie_status,
                                  @RequestParam(required = false) String tagline,
                                  @RequestParam(required = false) Double vote_average,
                                  @RequestParam(required = false) int vote_count) throws ParseException {
         mainService.CreateNewMovie(title,budget,homepage,overview,popularity,release_date,revenue,runtime,movie_status,
                tagline,vote_average,vote_count);
         List<Movie> movies = mainService.ObtainListLastMovies();
         model.addAttribute("movies",movies);
         return "createMovie";

    }

}
