package com.kh.practice.newwork.ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

public class APITest {
	
	public static void main(String[] args) {
		String serviceKey = "85468f1fe842b19ff5446a63ece728c99807c89fa830786b0baec3759cea928e";
		String serviceURL = "http://apis.data.go.kr/B552584/ArpltnInforInqireSvc/getMsrstnAcctoRltmMesureDnsty";
		BufferedReader br = null;
		
		try {
			serviceURL += "?serviceKey=" + serviceKey;
			serviceURL += "&stationName=" + URLEncoder.encode("종로구", "UTF-8");
			serviceURL += "&dataTerm=" + URLEncoder.encode("DAILY", "UTF-8");
			
			URL url = new URL(serviceURL);
			URLConnection conn = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} 
		catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
