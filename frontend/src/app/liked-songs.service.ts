import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LikedSongsService {
  private apiUrl = 'YOUR_API_ENDPOINT'; // Replace with your API endpoint

  constructor(private http: HttpClient) { }

  getAllLikedSongs() {
    return this.http.get<any[]>(`${this.apiUrl}/api/liked-songs`);
  }

  addLikedSong(song: any) {
    return this.http.post(`${this.apiUrl}/api/liked-songs`, song);
  }
}
