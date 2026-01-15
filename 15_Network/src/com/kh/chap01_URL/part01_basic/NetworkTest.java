package com.kh.chap01_URL.part01_basic;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Arrays;

public class NetworkTest {

	public static void main(String[] args) {
		NetworkTest nt = new NetworkTest();
		
//		nt.test1();
		nt.test2();
	}

	public void test1() {
		try {
			InetAddress naver = InetAddress.getByName("naver.com");
			System.out.println("naver : " + naver.getHostAddress());
		
			InetAddress google = InetAddress.getByName("google.com");
			System.out.println("google : " + google.getHostAddress());
			
			InetAddress arr[] = InetAddress.getAllByName("naver.com");
			System.out.println(Arrays.toString(arr));
			
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("Local : " + local.getHostAddress());
		}
		catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public void test2() {
		try {
			URL url = new URL("https://kh-academy.co.kr/project/teamView.kh?no=5403&cpage=1");
			System.out.println("Protocol : " + url.getProtocol());
			System.out.println("Host : " + url.getHost());
			System.out.println("Port : " + url.getPort());
			System.out.println("Default Port : " + url.getDefaultPort());
			System.out.println("Path : " + url.getPath());
			System.out.println("Query : " + url.getQuery());
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	public void test3() {
		String address = "https://khedu.co.kr/upload/project/2025062512331962_1.png";
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			URL url = new URL(address);
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
