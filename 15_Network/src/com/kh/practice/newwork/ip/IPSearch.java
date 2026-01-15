package com.kh.practice.newwork.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class IPSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("호스트명 : ");
		String host = sc.next();
		
		try {
			InetAddress ip[] = InetAddress.getAllByName(host);
			
			System.out.println(host + "는 " + ip.length + "개의 IP주소를 가지고 있습니다.");
			
			for(int i=0; i<ip.length; i++) {
				System.out.println("ip[" + (i+1) + "] : " + ip[i].getHostAddress());
			}
		} 
		catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
}
