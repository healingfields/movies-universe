package ma.showmaker.backend.services;

import ma.showmaker.backend.entities.Movies;
import ma.showmaker.backend.repositories.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
@Transactional
public class MoviesServicesImpl implements MoviesServices {

    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public List<Movies> allMovies() {
        return moviesRepository.findAll();
    }


    @Override
    public List<Movies> moviesSort() {

        return moviesRepository.findAllOrderByOriginalTitle(Sort.by(Sort.Direction.ASC,"originalTitle"));
    }

    @Override
    public List<Movies> searchMovie(String query) {
        return moviesRepository.searchMovies(query);
    }


}
