package com.kh.operator;

public class B_InDecrease {
	
	public void method1() {
		int num1 = 10;
		int num2 = 10;
		
		System.out.println("전위연산 전 num1 = " + num1);
		System.out.println("전위연산 후 num1 = " + ++num1);
		System.out.println("전위연산 최종 num1 = " + num1);
		
		System.out.println();
		
		System.out.println("후위연산 전 num2 = " + num2);
		System.out.println("후위연산 후 num2 = " + num2++);
		System.out.println("후위연산 최종 num1 = " + num2);
	}
	
	public void method2() {
		int a = 10;
		int b = ++a;
		int c = 10;
		int d = c++;
		
		System.out.printf("전위연산\na = %d\nb = %d\n", a, b);
		System.out.println();
		System.out.printf("후위연산\nc = %d\nd = %d\n", c, d);	
	}
	
	public void method3() {
		int num1 = 20;
		int result1 = num1++ * 3;
		
		System.out.println(num1);
		System.out.println(result1);
	}
	
	public void method4(){
        int a = 10;
        int b =20;
        int c = 30;
        //주석으로 어떻게 출력될거같은지 생각하기
        System.out.println(a++); // 10
        System.out.println((++a) + (b++)); // 32
        System.out.println((a++)+(--b)+(--c)); // 61
        System.out.printf("a: %d , b: %d, c: %d\n",a,b,c  ); // a=13, b=20, c=29
    }
	
}
