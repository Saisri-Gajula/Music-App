
package com.music.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.music.app.entity.Artist;
import com.music.app.repository.ArtistRepository;

@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    @Autowired
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    public Optional<Artist> getArtistById(Long id) {
        return artistRepository.findById(id);
    }

    public Artist createArtist(Artist artist) {
        return artistRepository.save(artist);
    }

    public Artist updateArtist(Long id, Artist updatedArtist) {
        if (artistRepository.existsById(id)) {
            updatedArtist.setId(id);
            return artistRepository.save(updatedArtist);
        } else {
            throw new RuntimeException("Artist not found");
        }
    }

    public void deleteArtist(Long id) {
        artistRepository.deleteById(id);
    }
}
