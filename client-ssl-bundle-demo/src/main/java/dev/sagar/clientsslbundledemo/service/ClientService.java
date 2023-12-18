package dev.sagar.clientsslbundledemo.service;

import dev.sagar.clientsslbundledemo.model.Movie;
import org.springframework.boot.autoconfigure.web.client.RestClientSsl;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import java.util.List;

@Service
public class ClientService {

    private final RestClient restClient;

    public ClientService(RestClient.Builder restClientBuilder, RestClientSsl ssl) {
        this.restClient = restClientBuilder
                .apply(ssl.fromBundle("clientapp"))
                .baseUrl("https://localhost:8443/api")
                .build();
    }

    public List<Movie> retrieveMovieList(){
        return restClient.get()
                .uri("/movies")
                .retrieve()
                .body(new ParameterizedTypeReference<List<Movie>>() {});

    }
}
