package com.kh.practice.dimension;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DimensionPractice {
	
	public void practice01() {
		String arr[][] = new String[3][3];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = "(" + i + ", " + j + ")";
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public void practice02() {
		int arr[][] = new int[4][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = j+1 + arr.length*i;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public void practice03() {
		int arr[][] = new int[4][4];
		
		int n = 16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = n--;
			}
			System.out.println(Arrays.toString(arr[i]));
		}
	}
	
	public void practice04() {
		int arr[][] = new int[4][4];
		
		int n = 16;
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 10 + 1);
				arr[3][j] += arr[i][j];
				
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println(Arrays.toString(arr[3]));
	}
	
	public void practice05() {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int x, y;
		char arr[][];
		
		while(true) {
			System.out.print("행 크기 : ");
			x = sc.nextInt();
			System.out.print("열 크기 : ");
			y = sc.nextInt();
			
			if(x<0 || x>10 || y<0 || y>10) {
				System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
				continue;
			}
			
			arr = new char[x][y];
			
			for(int i=0; i<arr.length-1; i++) {
				for(int j=0; j<arr[i].length; j++) {
					arr[i][j] = (char)(int)((Math.random()*26)+65);
				}
				System.out.println(Arrays.toString(arr[i]));
			}
			
			return;
		}
	}
	
	public void practice06() {
		String[][] arr = new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차", "지", "습", "으", "냅"}, {"원", 
			"열", "니", "로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "! ", "더", "!! "}};
			
			for(int i=0; i<arr.length; i++) {
				for(int j=0; j<arr[0].length; j++) {
					System.out.printf("%s ", arr[j][i]);
				}
				System.out.println();
			}
	}
	
	public void practice07() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행의 크기 : ");
		int x = sc.nextInt();
		
		int value = 97;
		char arr[][] = new char[x][];
		
		for(int i=0; i<arr.length; i++) {
			sc.nextLine();
			System.out.printf("%d행의 열 크기 : ", i);
			int y = sc.nextInt();
			
			arr[i] = new char[y];
			
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = (char)value++;
			}
			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%c ", arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void practice08() {
		
	}
	
}
