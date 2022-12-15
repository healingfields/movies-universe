package ma.showmaker.backend.batch;

import ma.showmaker.backend.entities.Movies;
import ma.showmaker.backend.repositories.MoviesRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MoviesItemWriter implements ItemWriter<Movies> {
    private final MoviesRepository moviesRepository;

    public MoviesItemWriter(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    public void write(List<? extends Movies> list) throws Exception {
        moviesRepository.saveAll(list);
    }
}
