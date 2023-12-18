package dev.sagar.serversslbundledemo.service;


import dev.sagar.serversslbundledemo.model.Movie;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final JdbcClient jdbcClient;

    public MovieService(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    public List<Movie> findMovies(){
        return jdbcClient.sql("select *from movies")
                .query(Movie.class)
                .list();
    }
}
