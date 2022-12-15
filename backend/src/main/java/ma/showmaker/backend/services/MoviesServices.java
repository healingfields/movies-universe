package ma.showmaker.backend.services;

import ma.showmaker.backend.entities.Movies;

import java.util.List;

public interface MoviesServices {

    List<Movies> allMovies();

    List<Movies> moviesSort();

    List<Movies> searchMovie(String query);
}
