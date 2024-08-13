package com.Project.ShowDekho.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "play")
public class Show {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sn;
    private String title;
    private int movieId;
    private LocalTime startTime;
    private LocalTime endTime;
    private LocalDate date;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Show(String title, int movieId, LocalTime startTime, LocalTime endTime, LocalDate date){
        this.title = title;
        this.movieId = movieId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.date = date;
    }
}
