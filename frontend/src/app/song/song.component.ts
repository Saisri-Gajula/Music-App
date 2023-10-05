import { Component, OnInit } from '@angular/core';

 

import { SongService } from '../song.service';
import { Song } from '../song.model';


 

 

 

 

 

 

@Component({

 

  selector: 'app-song-list',

 

  templateUrl: './song.component.html',

 

  styleUrls: ['./song.component.css'],

 

})

 

 

 

export class SongComponent implements OnInit {

// addPlayList(arg0: number) {

// throw new Error('Method not implemented.');

// }

 

  songList: Song[] = [];

 

  searchTerm: string = '';

 

  sortBy: string = '';

 

 

 

 

 

  newSong: Song = { id: 0, title: '', artist: [''] ,genre: '' };

 

 

 

  constructor(private songService: SongService) {}

 

 

 

  ngOnInit(): void {

 

      this.loadSongList();

 

  }

 

 

 

  loadSongList(): void {

 

      this.songService.getAllSong().subscribe((song) => {

 

          this.songList = song;

 

      });

 

  }

 

 

 

 

 

 

 

  addSong(): void {

 

    if (this.newSong.title && this.newSong.artist && this.newSong.genre) {

 

      this.songService.addSong(this.newSong).subscribe((addedSong) => {

 

        this.songList.push(addedSong);

 

         

 

        this.newSong = { id: 0, title: '', artist: [''], genre: '' };

 

      });

 

    } else {

 

      console.error('Invalid data for adding music.');

 

    }

 

  }

 

 

 

  deleteSong(id: number): void {

 

      this.songService.deleteSong(id).subscribe(() => {

 

          this.loadSongList();

 

      });

 

  }

 

 

 

  editSong(id: number): void {

 

      // Implement editing music logic

 

  }


}