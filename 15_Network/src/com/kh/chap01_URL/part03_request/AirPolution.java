package com.kh.chap01_URL.part03_request;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class AirPolution {
	
	public static void main(String[] args) {
		String serviceKey = "85468f1fe842b19ff5446a63ece728c99807c89fa830786b0baec3759cea928e";
		String serviceURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getCtprvnRltmMesureDnsty";
		
		try {
			serviceURL += "?serviceKey=" + serviceKey + "&sidoName=" + URLEncoder.encode("서울", "UTF-8");
			System.out.println(serviceURL);
			
			URL url = new URL(serviceURL);
			URLConnection conn = url.openConnection();
			
			try(BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					BufferedWriter bw = new BufferedWriter(new FileWriter("환경오염.xml"));) {
				String line = null;
				
				while((line = br.readLine()) != null) {
					bw.write(line);
					bw.newLine();
				}
			}
		}
		catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		catch(MalformedURLException e) {
			e.printStackTrace();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
}
