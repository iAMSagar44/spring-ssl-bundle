package dev.sagar.clientsslbundledemo.controller;

import dev.sagar.clientsslbundledemo.model.Movie;
import dev.sagar.clientsslbundledemo.service.ClientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data/films")
public class ClientController {

    private final ClientService clientService;
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientController.class);

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("")
    public List<Movie> getMovies(){
        return clientService.retrieveMovieList();
    }

    @GetMapping("/block/{delay}")
    public List<Movie> getMovies(@PathVariable int delay){
        LOGGER.info("The Thread the app is running on is :: {}", Thread.currentThread());
        return clientService.retrieveMovieListWithDelay(delay);
    }
}
