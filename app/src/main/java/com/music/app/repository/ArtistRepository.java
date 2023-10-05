
package com.music.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.music.app.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {
    // You can add custom query methods here if needed
}
