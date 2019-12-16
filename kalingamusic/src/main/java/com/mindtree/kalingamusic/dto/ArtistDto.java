package com.mindtree.kalingamusic.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class ArtistDto {

	private int artistId;

	private String artistName;
	@JsonIgnoreProperties("artist")
	private List<SongDto> songsList;

	public ArtistDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ArtistDto(int artistId, String artistName, List<SongDto> songsList) {
		super();
		this.artistId = artistId;
		this.artistName = artistName;
		this.songsList = songsList;
	}

	public int getArtistId() {
		return artistId;
	}

	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}

	public String getArtistName() {
		return artistName;
	}

	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	@JsonIgnore
	public List<SongDto> getSongsList() {
		return songsList;
	}

	public void setSongsList(List<SongDto> songsList) {
		this.songsList = songsList;
	}
	

}
