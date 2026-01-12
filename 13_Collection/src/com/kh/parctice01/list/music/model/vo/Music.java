package com.kh.parctice01.list.music.model.vo;

public class Music implements Comparable<Music>{

	private String title;
	private String singer;
	
	public Music() {
		// TODO Auto-generated constructor stub
	}
	
	public Music(String title, String singer) {
		super();
		this.title = title;
		this.singer = singer;
	}
	
	@Override
	public String toString() {
		return title + " - " + singer;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public int compareTo(Music o) {
		return o.singer.compareTo(this.singer);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}
	
}
