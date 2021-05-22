package pl.pjatk.zjazd4.MovieService.controller;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.pjatk.zjazd4.MovieService.service.MovieService;
import pl.pjatk.zjazd4.MovieService.model.Movie;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieRestController {
    private final MovieService movieService;

    public MovieRestController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> getMovie(){
        return ResponseEntity.ok(movieService.getAllMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findById(@PathVariable Long id){
        Optional<Movie> optionalMovie = movieService.getMovieById(id);
        if (optionalMovie.isPresent()) {
            return ResponseEntity.ok(optionalMovie.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Movie> addNewMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.updateMovieById(movie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletyById(@PathVariable Long id){
        movieService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}
