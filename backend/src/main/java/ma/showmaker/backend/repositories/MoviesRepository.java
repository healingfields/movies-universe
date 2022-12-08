package ma.showmaker.backend.repositories;

import ma.showmaker.backend.entities.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies,Long> {
}
