package com.kh.practice.chap02.abstractNInterface.model.vo;

public class V40 extends SmartPhone implements NotePen{

	public V40() {
		setMaker("LG");
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
		return "1200, 1600만 트리플 카메라";
	}



	@Override
	public String touch() {
		// TODO Auto-generated method stub
		return super.touch();
	}



	@Override
	public String charge() {
		// TODO Auto-generated method stub
		return super.charge();
	}


	@Override
	public boolean bluetoothPen() {
		// TODO Auto-generated method stub
		return false;
	}
	

	@Override
	public String printInformation() {
		// TODO Auto-generated method stub
		return "V40" + super.printInformation() + "\n블루투스 펜 탑재 여부 : " + bluetoothPen();
	}
	
}
