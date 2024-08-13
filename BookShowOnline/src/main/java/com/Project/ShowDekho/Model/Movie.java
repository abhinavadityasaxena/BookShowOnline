package com.Project.ShowDekho.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sn;
    private int movieId;
    private String title;
    private String language;
    private int castId;
    private String about;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Movie(int movieId, String title, String language, int castId, String about){
        this.movieId = movieId;
        this.title = title;
        this.language = language;
        this.castId = castId;
        this.about = about;
    }
}
