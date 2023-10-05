package com.music.app.controller;

import com.music.app.entity.Playlist;
import com.music.app.service.PlayListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/playlists")
@CrossOrigin("*")
public class PlaylistController {
    private final PlayListService playlistService;

    @Autowired
    public PlaylistController(PlayListService playlistService) {
        this.playlistService = playlistService;
    }

    @PostMapping
    public ResponseEntity<Playlist> createPlaylist(@RequestParam String name) {
        Playlist createdPlaylist = playlistService.createPlaylist(name);
        return new ResponseEntity<>(createdPlaylist, HttpStatus.CREATED);
    }

    @PostMapping("/{playlistId}/addSong/{songId}")
    public ResponseEntity<Void> addToPlaylist(@PathVariable Long playlistId, @PathVariable Long songId) {
        playlistService.addToPlaylist(playlistId, songId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
