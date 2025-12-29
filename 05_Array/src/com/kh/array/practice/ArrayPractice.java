package com.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice01() {
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
	
	public void practice02() {
		int arr[], n;
		
		System.out.print("양의 정수 : ");
		n = sc.nextInt();
		
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = i+1;
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
	
	public void practice03() {
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			System.out.printf("%d ", arr[i]);
		}
		System.out.println();
	}
	
	public void practice04() {
		char week[] = {'월', '화', '수', '목', '금', '토', '일'};
		int n;
		
		System.out.print("0~6 사이 숫자 입력 : ");
		n = sc.nextInt();
		
		if(n<0 || n>6) {
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
		System.out.printf("%c요일", week[n]);
	}
	
	public void practice05() {
		int n, arr[], tmp, sum=0;
		
		System.out.print("정수 : ");
		n = sc.nextInt();
		
		arr = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			tmp = sc.nextInt();
			sum += tmp;
			arr[i] = tmp;
		}
		
//		for(int i=0; i<n; i++) {
//			System.out.printf("%d ", arr[i]);
//		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.printf("\n총합 : %d", sum);
	}
	
	public void practice06() {
		
		String str;
		char arr[], arr2[];
		
		// 1. 문자열 입력 받기
		System.out.print("문자열 : ");
		str = sc.nextLine();
		
		// 2. 중첩을 제외하고 배열에 저장
		arr = str.toCharArray();
		arr2 = new char[arr.length];
		int cnt = 0;
		
		
		System.out.print("문자열에 있는 문자 : ");
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<=i; j++) {
				if(i==j) {
					System.out.printf("%c ", arr[i]);
				}
				if(arr[i] == arr[j]) {
					break;
				}
			}
		}
		System.out.println("\n문자 개수 : " + cnt);
	}
	
	public void practice07() {
		int cnt = 0;
		char arr[], ch;
		
		// 1. 문자열을 입력받아
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		
		// 2. 문자를 배열에 넣고
		arr = str.toCharArray();
		
		// 3. 검색할 문자가
		System.out.print("문자 : ");
		ch = sc.next().charAt(0);
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", str, ch);
		// 4. 몇번째 인덱스에 있는지 몇개 있는지 출력
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == ch) {
				System.out.printf("%d ", i);
				cnt++;
			}
		}
		System.out.printf("\n%c의 개수 : %d개", ch, cnt);
	}
	
	public void practice08() {
		System.out.print("주민등록번호(-포함) : ");
		String id = sc.next();
		
		char idArr[] = id.toCharArray();
		
		for(int i=0; i<idArr.length; i++) {
			if(i>7) {
				System.out.print("*");
			}
			else {
				System.out.printf("%c", idArr[i]);
			}
		}
		
		System.out.println();
		
		for(int i=0; i<id.length(); i++) {
			if(i>7) {
				System.out.print("*");
			}
			else {
				System.out.printf("%c", id.charAt(i));
			}
		}
	}
	
	public void practice09() {
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.printf("최댓값 : %d\n최솟값 : %d\n", arr[arr.length-1], arr[0]);
		
		int max = arr[0], min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		System.out.printf("최댓값 : %d\n최솟값 : %d\n", max, min);
	}
	
	public void practice10() {
		int rand;
		int arr[] = new int[10];
			
		for(int i=0; i<arr.length; i++) {
			rand = (int)(Math.random() * 10 + 1);
			
			for(int j=0; j<=i; j++) {
				if(i==j) {
					arr[i] = rand;
					break;
				}
				
				if(arr[j] == rand) {
					i--;
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	public void practice11() {
		int n;
		int arr[];
		int mid;
		
		while(true) {
			System.out.print("정수 : ");
			n = sc.nextInt();
			mid = n/2+1;
			
			arr = new int[n];
			
			if(n%2==0 || n<3) {
				System.out.println("다시 입력하세요.");
				continue;
			}
			
			for(int i=0; i<n; i++) {
				if(i<mid) {
					arr[i] = i+1;					
				}
				if(i>=mid) {
					arr[i] = --mid;
				}
			}
			
			System.out.println(Arrays.toString(arr));
			break;
		}
	}
	
	public void practice12() {
		System.out.println("배열의 크기를 입력하세요 : ");
		int n = sc.nextInt();
		char q;
		int index = 0;
		String arr[] = new String[n];
		
		while(true) {
			sc.nextLine();
			
			for(int i=index; i<index+n; i++) {
				System.out.printf("%d번째 문자열 : ", i+1);
				arr[i] = sc.nextLine();
			}
			
			index = arr.length;
			
			System.out.print("값을 더 입력하시겠습니까?(Y/N) : ");
			q = sc.next().charAt(0);
			
			if(q=='N'|| q=='n') {
				System.out.println(Arrays.toString(arr));
				return;
			}
			
			System.out.print("더 입력하고 싶은 개수 : ");
			n = sc.nextInt();
			
			arr = Arrays.copyOf(arr, arr.length+n);
		}
	}
	
}
