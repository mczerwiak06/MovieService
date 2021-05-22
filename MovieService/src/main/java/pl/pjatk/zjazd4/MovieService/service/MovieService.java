package pl.pjatk.zjazd4.MovieService.service;

import org.springframework.stereotype.Service;
import pl.pjatk.zjazd4.MovieService.model.Movie;
import pl.pjatk.zjazd4.MovieService.repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository){
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional getMovieById(Long id){

        return movieRepository.findById(id);
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovieById(Movie movie){
        Optional<Movie> byId = movieRepository.findById(movie.getId());
        if (byId.isEmpty()) {
            throw new RuntimeException();
        } else {
            return movieRepository.save(movie);
        }
    }

    public void deleteById(Long id){
        movieRepository.deleteById(id);
    }
}
