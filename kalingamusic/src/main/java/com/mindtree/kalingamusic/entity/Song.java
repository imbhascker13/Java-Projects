package com.mindtree.kalingamusic.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Song {

	@Id
	private int songId;
	private String songName;

	@OneToOne
	private Artist artist;

	@ManyToOne
	private Album album;

	public Song() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Song(int songId, String songName, Artist artist, Album album) {
		super();
		this.songId = songId;
		this.songName = songName;
		this.artist = artist;
		this.album = album;
	}

	public int getSongId() {
		return songId;
	}

	public void setSongId(int songId) {
		this.songId = songId;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

}
