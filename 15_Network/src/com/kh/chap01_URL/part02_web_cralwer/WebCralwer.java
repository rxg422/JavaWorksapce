package com.kh.chap01_URL.part02_web_cralwer;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebCralwer {
	
	public static void main(String[] args) {
		WebCralwer wc = new WebCralwer();
		
		wc.test1();
	}

	public void test1() {
		String path = "https://khedu.co.kr/project/team.kh";
		List<String> images = new ArrayList<>();
		BufferedReader br = null;
		
		try {
			URL url = new URL(path);
			URLConnection conn = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			StringBuilder sb = new StringBuilder();
			String line = null;
			while((line = br.readLine()) != null) {
				sb.append(line).append("\n");
			}
			
//			System.out.println(sb.toString());
			
			// 정규표현식
			String regex = "<img\s+src=\"([^\"]+)\"";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(sb);
			
			while(matcher.find()) {
				String image = matcher.group(1);
//				System.out.println(image);
				images.add(image);
			}
			
			saveFile(images);
		}
		catch(MalformedURLException e) {
			e.printStackTrace();
		} 
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			} 
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

	private void saveFile(List<String> images) {
		for(String imgPath : images) {
			
			if(!imgPath.startsWith("/upload/project")) {
				continue;
			}
			
			String fileName = imgPath.substring(imgPath.lastIndexOf("/"));
			String savePath = "C:/upload/kh/project";
			
			File dir = new File(savePath);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			
			try {
				URL url = new URL("https://khedu.co.kr" + imgPath);
				URLConnection conn = url.openConnection();
				
				try(BufferedInputStream bis = new BufferedInputStream(conn.getInputStream()); 
						BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dir+fileName))) {
					int value = 0;
					
					while((value = bis.read()) != -1) {
						bos.write(value);
					}
					
					System.out.println(fileName + " 저장 완료");
				}
			} 
			catch(MalformedURLException e) {
				e.printStackTrace();
			} 
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
