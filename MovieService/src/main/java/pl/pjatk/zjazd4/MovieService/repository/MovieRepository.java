package pl.pjatk.zjazd4.MovieService.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pl.pjatk.zjazd4.MovieService.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Override
    @Query("select m from Movie m")
    List<Movie> findAll();

    @Override
    @Query("select m from Movie m where m.id = ?1")
    Optional<Movie> findById(Long along);

    @Override
    @Query(value = "insert into Movie values (?1, ?2, ?3)", nativeQuery = true)
    <S extends Movie> S save(S s);

    @Override
    @Query("delete from Movie m where m.id = ?1")
    void deleteById(Long aLong);
}
