package com.music.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.music.app.entity.Song;

public interface SongRepository extends JpaRepository< Song, Long> {
}
