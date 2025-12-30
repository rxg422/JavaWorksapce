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
		String students[] = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배", "송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		String seat1[][] = new String[3][2];
		String seat2[][] = new String[3][2];
		int x=0, y=0;
		
		for(int i=0; i<3; i++) {
			System.arraycopy(students, i*2, seat1[i], 0, 2);
			System.arraycopy(students, 6+i*2, seat2[i], 0, 2);
		}

		System.out.println("== 1분단 ==");
		for(int i=0; i<3; i++) {
			System.out.println(Arrays.toString(seat1[i]));
		}
		
		System.out.println("\n== 2분단 ==");
		for(int i=0; i<3; i++) {
			System.out.println(Arrays.toString(seat2[i]));
		}
	}
	
	public void practice09() {
		Scanner sc = new Scanner(System.in);
		
		String seat1[][] = {{"강건강", "남나나"}, {"도대담", "류라라"}, {"문미미", "박보배"}};
		String seat2[][] = {{"송성실", "윤예의"}, {"진재주", "차천축"}, {"피풍표", "홍하하"}};
		
		System.out.println("== 1분단 ==");
		for(int i=0; i<3; i++) {
			System.out.println(Arrays.toString(seat1[i]));
		}
		
		System.out.println("== 2분단 ==");
		for(int i=0; i<3; i++) {
			System.out.println(Arrays.toString(seat2[i]));
		}
		
		System.out.print("\n검색할 학생의 이름을 입력하세요 : ");
		String name = sc.next();
		
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				if(seat1[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 1분단 %s번째 줄 %s에 있습니다.", name, (i==0 ? "첫" : i==1 ? "두" : "세"), (j==0 ? "왼쪽" : "오룬쪽"));
				}
				if(seat2[i][j].equals(name)) {
					System.out.printf("검색하신 %s 학생은 2분단 %s번째 줄 %s에 있습니다.", name, (i==0 ? "첫" : i==1 ? "두" : "세"), (j==0 ? "왼쪽" : "오룬쪽"));
				}
			}
		}
	}
	
}
