import { NgModule } from '@angular/core';

import { BrowserModule } from '@angular/platform-browser';

import { HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';

import { SongComponent } from './song/song.component';

import { FormsModule } from '@angular/forms';
import { LikedSongsComponent } from './liked-songs/liked-songs.component';
import { AddLikedSongComponent } from './add-liked-song/add-liked-song.component';

// import { PlaylistComponent } from './playlist/playlist.component';

 

@NgModule({

  declarations: [

 

    AppComponent,

    SongComponent,
     LikedSongsComponent,
     AddLikedSongComponent

  ],

  imports: [

    BrowserModule,

    FormsModule,

    HttpClientModule,

    AppRoutingModule

  ],

  providers: [],

  bootstrap: [AppComponent]

})

export class AppModule { }

 
