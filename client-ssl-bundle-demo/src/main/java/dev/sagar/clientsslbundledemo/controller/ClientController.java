package dev.sagar.clientsslbundledemo.controller;

import dev.sagar.clientsslbundledemo.model.Movie;
import dev.sagar.clientsslbundledemo.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/data/films")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping("")
    public List<Movie> getMovies(){
        return clientService.retrieveMovieList();
    }
}
