import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LikedSongsComponent } from './liked-songs/liked-songs.component';
import { AddLikedSongComponent } from './add-liked-song/add-liked-song.component';

const routes: Routes = [
  { path: 'liked-songs', component: LikedSongsComponent },
  { path: 'add-liked-song', component: AddLikedSongComponent },
  { path: '', redirectTo: '/liked-songs', pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
