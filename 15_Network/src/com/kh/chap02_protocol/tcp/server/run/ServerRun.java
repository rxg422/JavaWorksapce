package com.kh.chap02_protocol.tcp.server.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerRun {

	public static void main(String[] args) {
		// 0 ~ 1023 : 시스템 포트
		// 1024 ~ 65535 : 사용 가능 포트
		ServerSocket server = null;
		
		try {
			server = new ServerSocket(30000);
			System.out.println("*** Start Server ***");
			
			while(true) {
				System.out.println("### 클라이언트 요청 대기 ###");
				// 요청이 들어오면 클라이언트와 통신이 가능한 객체 생성
				Socket client = server.accept();
				
				System.out.println("### 클라이언트 연결 성공 ###");
				System.out.println("Client IP : " + client.getInetAddress().getHostAddress());
				
				try(BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
						PrintWriter pw = new PrintWriter(client.getOutputStream(), true);) {
//					PrintWriter pw = new PrintWriter(client.getOutputStream(), true);
					
					while(true) {
						String message = br.readLine();
						
						if(message.equals("exit")) {
							System.out.println("### 접속 종료 ###");
							break;
						}
						System.out.println("메시지 : " + message);
						pw.println("성공적으로 메시지를 받았습니다.");
					}
				}
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}
