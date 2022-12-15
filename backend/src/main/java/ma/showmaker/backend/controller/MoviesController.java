package ma.showmaker.backend.controller;


import ma.showmaker.backend.entities.Movies;
import ma.showmaker.backend.services.MoviesServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/home/movies")
public class MoviesController {
    @Autowired
    private MoviesServicesImpl moviesServices;

    @GetMapping("/")
    List<Movies> listAllMovies(){
        return moviesServices.allMovies();
    }

    @GetMapping("/title")
    List<Movies> byTitle(){
        return moviesServices.moviesSort();
    }


    @GetMapping("/search")
    List<Movies> bySearch(@RequestParam("query") String query){
        return moviesServices.searchMovie(query);
    }







}
