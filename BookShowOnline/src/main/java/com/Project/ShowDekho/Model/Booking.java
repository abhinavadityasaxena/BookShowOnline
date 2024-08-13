package com.Project.ShowDekho.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Entity
@Table(name = "booking")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sn;
    private int seatNo;
    private String status;
    private int userId;
    private int movieSn;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Booking(int seatNo, String status, int userId, int movieSn){
        this.seatNo = seatNo;
        this.status = status;
        this.userId = userId;
        this.movieSn = movieSn;
    }
}
