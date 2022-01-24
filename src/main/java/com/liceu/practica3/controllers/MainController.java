package com.liceu.practica3.controllers;

import com.liceu.practica3.models.Movie;
import com.liceu.practica3.models.Person;
import com.liceu.practica3.services.MainService;
import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String createActor(Model model,@RequestParam(required = false) String person_name){
        Long person_id = mainService.ObtainMaxIdPerson().getPerson_id();
        mainService.CreateNewPerson(person_id,person_name);
        mainService.PersonList();
        return "createdPersons";
    }
}
