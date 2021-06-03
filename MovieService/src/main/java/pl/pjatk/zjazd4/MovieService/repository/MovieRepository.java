package pl.pjatk.zjazd4.MovieService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.zjazd4.MovieService.model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Override
    List<Movie> findAll();

    @Override
    Optional<Movie> findById(Long along);

    @Override
    <S extends Movie> S save(S s);

    @Override
    void deleteById(Long aLong);
}
