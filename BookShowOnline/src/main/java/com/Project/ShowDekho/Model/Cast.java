package com.Project.ShowDekho.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "cast")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cast {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int sn;
    private String actor;
    private String rolePlayed;
    private int castId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Cast(String actor, String rolePlayed, int castId){
        this.actor = actor;
        this.rolePlayed = rolePlayed;
        this.castId = castId;
    }
}
