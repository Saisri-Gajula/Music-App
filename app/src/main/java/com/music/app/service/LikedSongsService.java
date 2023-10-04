package com.music.app.service;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.music.app.entity.LikedSongs;
import com.music.app.repository.LikedSongsRepository;

@Service
public class LikedSongsService {
    private final LikedSongsRepository likedSongsRepository;

    @Autowired
    public LikedSongsService(LikedSongsRepository likedSongsRepository) {
        this.likedSongsRepository = likedSongsRepository;
    }

    public List<LikedSongs> getAllLikedSongs() {
        return likedSongsRepository.findAll();
    }

    public LikedSongs addLikedSong(LikedSongs likedSongs) {
        return likedSongsRepository.save(likedSongs);
    }

    public void deleteLikedSong(Long id) {
        likedSongsRepository.deleteById(id);
    }
    
    // You can add more custom methods for business logic if needed
}
