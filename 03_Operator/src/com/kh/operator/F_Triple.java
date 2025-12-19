package com.kh.operator;

public class F_Triple {
	
	public void method1() {
		int num = 50;
		boolean result = num > 0 ? true : false;
		System.out.println(result ? "양수입니다" : "음수 또는 0입니다");
	}
	
	public void method2() {
		int num = 0;
		String result = num==0 ? "0입니다" : (num>0 ? "양수입니다" : "음수입니다");
		System.out.println(result);
	}
	
	public void quiz() {
        int a = 5;
        int b = 10;
        int c = (++a) + b; // a:6, b:10, c:16
        int d = c / a; // a:6, b:10, c:16, d:2
        int e = c % a; // a:6, b:10, c:16, d:2, e:4
        int f = e++; // a:6, b:10, c:16, d:2, e:5, f:4
        int g = (--b) +(d--); // a:6, b:9, c:16, d:1, e:5, f:4, g:11
        int h = 2; // a:6, b:9, c:16, d:1, e:5, f:4, g:11, h:2
        int i = (a++) + b / (--c / f) * (g-- - d) % (++e + h); // a:7, b:9, c:15, d:1, e:6, f:4, g:10, h:2, i:12
        System.out.println("a : "+a);
        System.out.println("b : "+b);
        System.out.println("c : "+c);
        System.out.println("d : "+d);
        System.out.println("e : "+e);
        System.out.println("f : "+f);
        System.out.println("g : "+g);
        System.out.println("h : "+h);
        System.out.println("i : "+i);
        // a:7, b:9, c:15, d:1, e:6, f:4, g:10, h:2, i:12
	}

	
}
