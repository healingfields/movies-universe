package ma.showmaker.backend.batch;

import ma.showmaker.backend.entities.Movies;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

@Component
public class MoviesItemProcessor implements ItemProcessor<Movies,Movies> {
    @Override
    public Movies process(Movies movies) throws Exception {
        return movies;
    }
}
