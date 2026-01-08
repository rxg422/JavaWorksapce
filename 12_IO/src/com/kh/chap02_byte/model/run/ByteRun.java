package com.kh.chap02_byte.model.run;

import com.kh.byteRun.bite.model.vo.FileByteDao;

public class ByteRun {
	
	public static void main(String[] args) {
		// Stream : 입출력을 위한 통로
		// 			단방형
		//			입력 출력 스트림이 따로 존재하며, 선입선출 이다.
		//			네트워크 지연, 버퍼링 등으로 시간 지연 문제 발생
		// Stream 구분
		// 	통로의 사이즈를 기준으로 구분
		// 	바이트 스트림(InputStream/OutputStram)
		// 	문자 스트림(Reader / Writer)
		//	InputOutput 스트림은 바이트 스트림계의 최상위 클래스로, 각 입력매체에 알맞는 출력기능을 하위 클래스에서 구현
		//	기반 스트림 : 외부 매체와 직접적으로 연결하는 기능을 가진 스트림
		//	보조 스트림 : 기반 스트림의 성능 향상을 목적으로 하는 기능을 가짐. 단독으로 사용 불가능
		
		FileByteDao fbd = new FileByteDao();
		
//		fbd.fileSave();
		fbd.fileRead();
	}
	
}
