package com.kh.practice2.score.view;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import com.kh.practice2.score.controller.ScoreController;

public class ScoreMenu {

	private Scanner sc = new Scanner(System.in);
	private ScoreController scr = new ScoreController();
	
	public void mainMenu() {
		int menu;
		
		while(true) {
			System.out.print("===== Main Menu =====\n1. 성적 저장\n2. 성적 출력\n9. 끝내기\n메뉴 입력 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				saveScore();
				break;
			case 2:
				readScore();
				break;
			case 9:
				System.out.print("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요.");
			}
		}
	}
	
	public void saveScore() {
		int num = 0, kor, eng, math, sum;
		double avg;
		String name;
		char exit;
		
		sc.nextLine();
		while(true) {
			System.out.printf("%d번 째 학생 정보 기록\n", ++num);
			System.out.print("이름 : ");
			name = sc.next();
			
			System.out.print("국어 : ");
			kor = sc.nextInt();
			
			System.out.print("영어 : ");
			eng = sc.nextInt();
			
			System.out.print("수학 : ");
			math = sc.nextInt();
			
			sum = kor + eng + math;
			avg = sum / 3;
			
			scr.saveScore(name, kor, eng, math, sum, avg);
			
			System.out.print("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
			exit = sc.next().charAt(0);
			
			if(exit == 'n' || exit == 'N') {
				break;
			}
		}
	}
	
	public void readScore() {
		DataInputStream dis = null;
		int num = 0, sum = 0, s;
		
		try {
			dis = scr.readScore();
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
			while(true) {
				System.out.printf("%s\t", dis.readUTF());
				System.out.printf("%d\t", dis.readInt());
				System.out.printf("%d\t", dis.readInt());
				System.out.printf("%d\t", dis.readInt());
				s = dis.readInt();
				sum += s;
				System.out.printf("%d\t", s);
				System.out.printf("%f", dis.readDouble());
				System.out.print(dis.readUTF());
				num++;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (EOFException e) {
			System.out.println("읽은 횟수\t전체 합계\t전체 평균");
			System.out.printf("%d\t%d\t%f\n", num, sum, sum/(num*3.0));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
