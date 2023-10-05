import { Component, OnInit } from '@angular/core';
import { LikedSongsService } from '../liked-songs.service';

@Component({
  selector: 'app-liked-songs',
  templateUrl: './liked-songs.component.html',
  styleUrls: ['./liked-songs.component.css']
})
export class LikedSongsComponent implements OnInit {
  likedSongs!: any[]; // You may want to define a proper type for songs

  constructor(private likedSongsService: LikedSongsService) { }

  ngOnInit() {
    this.loadLikedSongs();
  }

  loadLikedSongs() {
    this.likedSongsService.getAllLikedSongs().subscribe(data => {
      this.likedSongs = data;
    });
  }
}
