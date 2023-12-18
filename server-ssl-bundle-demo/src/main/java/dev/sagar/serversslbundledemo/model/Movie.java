package dev.sagar.serversslbundledemo.model;

import java.time.LocalDate;

public record Movie(int id, String title, String directorName,
                    LocalDate releaseDate) {
}
