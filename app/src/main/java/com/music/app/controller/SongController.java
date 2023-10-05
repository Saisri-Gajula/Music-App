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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// import com.music.app.entity.Playlist;
import com.music.app.entity.Song;
// import com.music.app.service.PlayListService;
import com.music.app.service.SongService;

@RestController
@RequestMapping("/api/song")
@CrossOrigin("*")
public class SongController {
 private final SongService songService;

    

 @Autowired
 public SongController(SongService songService) {
     this.songService = songService;
 }

 @GetMapping
 public List<Song> getAllSong() {
     return songService.getAllSong();
 }

 @PostMapping
 public ResponseEntity<Song> addMusic(@RequestBody Song song) {
     Song addedSong = songService.addSong(song);
     return new ResponseEntity<>(addedSong, HttpStatus.CREATED);
 }

 @DeleteMapping("/{id}")
 public ResponseEntity<Void> deleteSong(@PathVariable Long id) {
     songService.deleteSong(id);
     return new ResponseEntity<>(HttpStatus.NO_CONTENT);
 }

 @PutMapping("/{id}")
 public ResponseEntity<Song> editSong(@PathVariable Long id, @RequestBody Song updatedSong) {
     Song editedSong = songService.editSong(id, updatedSong);
     return new ResponseEntity<>(editedSong, HttpStatus.OK);
 }

 
}
