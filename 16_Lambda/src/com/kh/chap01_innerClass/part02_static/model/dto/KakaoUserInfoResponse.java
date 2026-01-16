package com.kh.chap01_innerClass.part02_static.model.dto;

import java.util.Date;

public class KakaoUserInfoResponse {

	// DTO(Data Transfer Object) : 값을 전달하기 위한 클래스, API, DB등과 데이터를 송수신 하기 위한 클래스
	// VO(Value Object) : 가치가 있는 클래스를 표현하기 위한 목적으로 사용하는 클래스, 객체지향적으로 설계된 클래스
	
	private long id;
	private Date synchedAt;
	private KakaoAccount kakaoAccount;
	
	public static class KakaoAccount {
		private boolean profileNeedsAgreement;
		private Profile profile;
	}
	
	public static class Profile {
		private String nickname;
		private String thunmbnailImageUrl;
	}
	
}
