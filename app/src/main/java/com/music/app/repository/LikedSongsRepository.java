package com.music.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.music.app.entity.LikedSongs;

public interface LikedSongsRepository extends JpaRepository<LikedSongs, Long> {
    // You can define custom query methods if needed
}

