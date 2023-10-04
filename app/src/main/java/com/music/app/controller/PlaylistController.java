package com.music.app.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.music.app.entity.Playlist;
import com.music.app.service.PlayListService;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api/playlists")
public class PlaylistController {

    @Autowired
    private PlayListService playlistService;

    @GetMapping
    public ResponseEntity<List<Playlist>> getAllPlaylists() {
        List<Playlist> playlists = playlistService.getAllPlaylists();
        return ResponseEntity.ok(playlists);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Playlist> getPlaylistById(@PathVariable Long id) {
        return playlistService.getPlaylistById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Playlist> createPlaylist(@RequestBody Playlist playlist) throws URISyntaxException {
        Playlist createdPlaylist = playlistService.createPlaylist(playlist);
        return ResponseEntity.created(new URI("/api/playlists/" + createdPlaylist.getId())).body(createdPlaylist);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updatePlaylist(@PathVariable Long id, @RequestBody Playlist updatedPlaylist) {
        playlistService.updatePlaylist(id, updatedPlaylist);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlaylist(@PathVariable Long id) {
        playlistService.deletePlaylist(id);
        return ResponseEntity.noContent().build();
    }
}
