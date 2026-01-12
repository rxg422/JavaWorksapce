package com.kh.parctice01.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.parctice01.list.compare.AscTitle;
import com.kh.parctice01.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList<>();
	
	public int addList(Music music) {
		try {
			list.add(music);
		} 
		catch (Exception e) {
			return 0;
		}
		
		return 1;
	}
	
	public int addAtZero(Music music) {
		try {
			list.add(0, music);
		} 
		catch (Exception e) {
			return 0;
		}
		
		return 1;
	}
	
	public List<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		for(Music m : list) {
			if(m.getTitle().equals(title)) {
				return m;
			}
		}
		
		return null;
	}
	
	public Music removeMusic(String title) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.remove(i);
			}
		}
		
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.add(i, music);
				return list.remove(i+1);
			}
		}
		
		return null;
	}
	
	public int ascTitle() {
		try {
			Comparator<Music> comp = new AscTitle();
			Collections.sort(list, comp);
		}
		catch (Exception e) {
			return 0;
		}
		
		return 1;
	}
	
	public int descSinger() {
		try {
			Collections.sort(list);
		} catch (Exception e) {
			return 0;
		}
		
		return 1;
	}
	
}
