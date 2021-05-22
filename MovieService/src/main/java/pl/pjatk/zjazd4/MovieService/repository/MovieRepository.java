package pl.pjatk.zjazd4.MovieService.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.pjatk.zjazd4.MovieService.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
