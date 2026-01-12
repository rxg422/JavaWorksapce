package com.kh.chap01_list.part01_arrayList.model.vo;

public class Music implements Comparable<Music>{
	
	private String title;
	private String artist;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}

	public Music(String title, String artist) {
		super();
		this.title = title;
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + "]";
	}

	@Override
	public int compareTo(Music o) {
		if(this.title.compareTo(o.title) == 0) {
			return this.artist.compareTo(o.artist);
		}
		
		return this.title.compareTo(o.title);
	}

}
