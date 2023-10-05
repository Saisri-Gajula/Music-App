package com.music.app.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Song {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	private String title;
	private List<String> artist;
	private String genre;
	// Add the following field to the Song entity
@ManyToMany(mappedBy = "songs")
private List<Playlist> playlists = new ArrayList<>();

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
public List<String> getArtist(){
	return artist;
}
public void setArtist(List<String> artist){
	this.artist=artist;
}
public List<Playlist> getPlaylists() {
	return playlists;
}
}






