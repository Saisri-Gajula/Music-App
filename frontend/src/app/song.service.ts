import { HttpClient } from '@angular/common/http';

import { Injectable } from '@angular/core';

import { Observable } from 'rxjs';

import { Song } from './song.model';

 

 

@Injectable({

  providedIn: 'root',

})

export class SongService {

  private baseUrl = 'http://localhost:8080/api/song';

 

  constructor(private http: HttpClient) {}

 

  getAllSong(): Observable<Song[]> {

      return this.http.get<Song[]>(this.baseUrl);

  }

 

  addSong(song: Song): Observable<Song> {

      return this.http.post<Song>(this.baseUrl, song);

  }

 

  deleteSong(id: number): Observable<void> {

      return this.http.delete<void>(`${this.baseUrl}/${id}`);

  }

 

  editSong(id: number, updatedSong: Song): Observable<Song> {

      return this.http.put<Song>(`${this.baseUrl}/${id}`, updatedSong);

  }

 

}