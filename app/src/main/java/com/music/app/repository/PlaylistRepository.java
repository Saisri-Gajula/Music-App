package com.music.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.music.app.entity.Playlist;


public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}