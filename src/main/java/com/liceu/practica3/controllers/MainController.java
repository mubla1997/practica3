package com.liceu.practica3.controllers;

import com.liceu.practica3.models.Movie;
import com.liceu.practica3.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @Autowired
    MainService mainService;

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/movies")
    public String movies(Model model){
        List <Movie> movies = mainService.FindAllMovies();
        System.out.println(movies);
        model.addAttribute("movies", movies);
        return "movies";

    }
}
