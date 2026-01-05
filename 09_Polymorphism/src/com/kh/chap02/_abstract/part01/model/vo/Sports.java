package com.kh.chap02._abstract.part01.model.vo;

public abstract class Sports {

	private int player;
	
	public Sports() {
		// TODO Auto-generated constructor stub
	}

	public Sports(int player) {
		this.player = player;
	}

	public int getPlayer() {
		return player;
	}

	public void setPlayer(int player) {
		this.player = player;
	}

	@Override
	public String toString() {
		return "Sports [player=" + player + "]";
	}
	
//	public void rule() {
//		System.out.println("경기 규칙");
//	}
	
	public abstract void rule();
	
}
