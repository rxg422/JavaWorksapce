package com.kh.parctice01.list.compare;

import java.util.Comparator;

import com.kh.parctice01.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{

	@Override
	public int compare(Music o1, Music o2) {
		if(o1.getTitle().compareTo(o2.getTitle()) == 0)  {
			return o1.getSinger().compareTo(o2.getSinger());
		}
		
		return o1.getTitle().compareTo(o2.getTitle());
	}

}
