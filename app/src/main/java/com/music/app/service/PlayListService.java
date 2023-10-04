package com.music.app.service;
 import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.music.app.entity.Playlist;
import com.music.app.repository.PlaylistRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PlayListService {

    @Autowired
    private PlaylistRepository playlistRepository;

    public List<Playlist> getAllPlaylists() {
        return playlistRepository.findAll();
    }

    public Optional<Playlist> getPlaylistById(Long id) {
        return playlistRepository.findById(id);
    }

    public Playlist createPlaylist(Playlist playlist) {
        return playlistRepository.save(playlist);
    }

    public void updatePlaylist(Long id, Playlist updatedPlaylist) {
        if (playlistRepository.existsById(id)) {
            updatedPlaylist.setId(id);
            playlistRepository.save(updatedPlaylist);
        }
    }

    public void deletePlaylist(Long id) {
        playlistRepository.deleteById(id);
    }
}
