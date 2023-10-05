import { Component } from '@angular/core';
import { LikedSongsService } from '../liked-songs.service';

@Component({
  selector: 'app-add-liked-song',
  templateUrl: './add-liked-song.component.html',
  styleUrls: ['./add-liked-song.component.css']
})
export class AddLikedSongComponent {
  newSong = {
    title: '',
    artist: ''
  };

  constructor(private likedSongsService: LikedSongsService) { }

  addLikedSong() {
    this.likedSongsService.addLikedSong(this.newSong).subscribe(() => {
      // Handle success or error
      // You can redirect or show a message here
    });
  }
}
