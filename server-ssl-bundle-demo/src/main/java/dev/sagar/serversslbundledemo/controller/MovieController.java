package dev.sagar.serversslbundledemo.controller;


import dev.sagar.serversslbundledemo.model.Movie;
import dev.sagar.serversslbundledemo.service.MovieService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("")
    public List<Movie> getMovies(){
        return movieService.findMovies();
    }

    @GetMapping("/delay/{delay}")
    public List<Movie> getMoviesWithDelay(@PathVariable int delay){
        try {
            Thread.sleep(1000L * delay);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return movieService.findMovies();
    }
}
