package com.mindtree.kalingamusic.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


public class SongDto {

	private int songId;

	private String songName;
	@JsonIgnoreProperties("songsList")
	private ArtistDto artist;
	@JsonIgnoreProperties("songs")
	private AlbumDto album;

	public SongDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SongDto(int songId, String songName, ArtistDto artist, AlbumDto album) {
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

	public ArtistDto getArtist() {
		return artist;
	}

	public void setArtist(ArtistDto artist) {
		this.artist = artist;
	}

	@JsonIgnore
	public AlbumDto getAlbum() {
		return album;
	}

	public void setAlbum(AlbumDto album) {
		this.album = album;
	}
	

}
