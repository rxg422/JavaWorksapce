package com.kh.chap02_protocol.tcp.client.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientRun {
	
	public static void main(String[] args) {
		int serverPort = 30000;
		String serverIP = "192.168.10.32";
		
		Socket socket = null;
		
		try {
			socket = new Socket(serverIP, serverPort);
			System.out.println("*** 서버 연결 성공 ***");
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
					PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
					Scanner sc = new Scanner(System.in);) {
				while(true) {
					System.out.print("보낼 메시지 : ");
					String message = sc.nextLine();
					
					pw.println(message);
					
					if(message.equals("exit")) {
						System.out.println("접속 종료");
						break;
					}
					
					System.out.println("받은 메시지 : " + br.readLine());
				}
			}
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
