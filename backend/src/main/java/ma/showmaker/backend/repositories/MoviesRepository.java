package ma.showmaker.backend.repositories;

import ma.showmaker.backend.entities.Movies;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MoviesRepository extends JpaRepository<Movies,Long>  {


    @Query("FROM Movies")
    List<Movies> findAllOrderByOriginalTitle(Sort sort);

    @Query("SELECT m FROM Movies m WHERE m.originalTitle LIKE CONCAT('%', :query, '%')")
    List<Movies> searchMovies(String query);

    @Query(value = "SELECT * FROM Movies m WHERE m.originalTitle LIKE CONCAT('%', :query, '%')",nativeQuery = true)
    List<Movies> searchMoviesSql(String query);


}
