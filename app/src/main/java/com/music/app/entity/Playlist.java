package com.music.app.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Getter;


@Entity
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // @ManyToMany
    // @JoinTable(
    //         name = "playlist_song",
    //         joinColumns = @JoinColumn(name = "playlist_id"),
    //         inverseJoinColumns = @JoinColumn(name = "song_id")
    // )
    private List<Song> songs = new ArrayList<>();

    public void setName(String name2) {
    }

    public void addSong(Song song) {
    }

    // Constructors, getters, setters
}
