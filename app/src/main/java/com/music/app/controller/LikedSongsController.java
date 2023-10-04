package com.music.app.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.music.app.entity.LikedSongs;
import com.music.app.service.LikedSongsService;

@RestController
@RequestMapping("/api/liked-songs")
@CrossOrigin
public class LikedSongsController {
    private final LikedSongsService likedSongsService;

    @Autowired
    public LikedSongsController(LikedSongsService likedSongsService) {
        this.likedSongsService = likedSongsService;
    }

    @GetMapping
    public List<LikedSongs> getAllLikedSongs() {
        return likedSongsService.getAllLikedSongs();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<LikedSongs> addLikedSong(@RequestBody LikedSongs likedSongs) {
        LikedSongs addedLikedSong = likedSongsService.addLikedSong(likedSongs);
        return new ResponseEntity<>(addedLikedSong, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteLikedSong(@PathVariable Long id) {
        likedSongsService.deleteLikedSong(id);
    }
}

