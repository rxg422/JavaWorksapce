package com.kh.practice.chap02.abstractNInterface.model.vo;

public class GlaxyNote9 extends SmartPhone implements NotePen{
	
	public GlaxyNote9() {
		setMaker("삼성");
	}
	
	@Override
	public String makeCall() {
		// TODO Auto-generated method stub
		return super.makeCall();
	}

	@Override
	public String takeCall() {
		// TODO Auto-generated method stub
		return super.takeCall();
	}

	@Override
	public String picture() {
		return "1200만 듀얼 카메라";
	}

	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return super.touch() + ", 와콤펜 지원";
	}

	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return super.charge();
	}

	@Override
	public boolean bluetoothPen() {
		return true;
	}

	@Override
	public String printInformation() {
		
		return "갤럭시 노트 9"+ super.printInformation() + "\n블루투스 펜 탑재 여부 : " + bluetoothPen();
	}

	
	
}
