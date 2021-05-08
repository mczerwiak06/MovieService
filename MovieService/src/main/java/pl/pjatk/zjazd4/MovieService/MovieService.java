package pl.pjatk.zjazd4.MovieService;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MovieService {

    public List<Movie> getAllMovies(){
        Movie movie1 = new Movie(1L, "Chłopaki nie płaczą", "Komedia");
        Movie movie2 = new Movie(2L, "Rambo", "Akcja");
        Movie movie3 = new Movie(3L, "Piątek 13", "Horror");
        return List.of(movie1, movie2, movie3);
    }

    public Movie getMovieById(Long id){

        //return new Movie(1L, "Chłopaki nie płaczą", "Komedia");
        if (id == 1L)
            return new Movie(1L, "Chłopaki nie płaczą", "Komedia");

        else if (id == 2L)
            return  new Movie(2L, "Rambo", "Akcja");

        else
            return  new Movie(3L, "Piątek 13", "Horror");
    }

    public Movie addMovie(Movie movie) {
        return movie;
    }
}
