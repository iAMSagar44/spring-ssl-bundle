package dev.sagar.clientsslbundledemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDate;

public record Movie(int id, String title, String directorName,
                    @JsonIgnore LocalDate releaseDate) {
}
