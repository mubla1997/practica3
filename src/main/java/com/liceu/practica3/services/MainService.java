package com.liceu.practica3.services;

import com.liceu.practica3.models.Movie;
import com.liceu.practica3.repositories.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MainService {
    @Autowired
    MovieRepo movieRepo;

   public List<Movie> FindAllMovies(){
        return movieRepo.findAll();
    }
}
