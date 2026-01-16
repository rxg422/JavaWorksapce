package com.kh.chap02_lambda.part02_practice;

import com.kh.chap02_lambda.mode.functinal.LambdaTest1;
import com.kh.chap02_lambda.mode.functinal.LambdaTest2;

public class LambdaPrectice {

	public static void main(String[] args) {
		LambdaTest1 lambda1 = (a, b) -> {
			return a+b;
		};
		
		LambdaTest2 lambda2 = s -> {
				System.out.println(s);
		};
		
		LambdaTest2 lambda4 = s -> System.out.println(s);
		LambdaTest1 lambda5 = (a, b) ->  a + b;
		lambda5.add(1, 2);
		
		// - 실습문제 -
        // 각 람다식을 가장 간결한 형태로 표현하기
        // 1. ((int x) -> { return (x * x); });
//		x -> x * x;
		
        // 2. (String str) -> { return (str.length()); };
//		str -> str.length();
		
        // 3.  (int x) -> { System.out.println(x); return x; };
//		x -> {
//			System.out.println(x);
//			return x;
//		};
		
        // 4. (String str) -> { return (str.toUpperCase()); };
//		str -> str.toUpperCase();
		
        // 5. (int x , int y) -> { return (x * y); };
//		(x, y) -> x * y;
		
        // 6. ((int x , int y) -> { return (x % y == 0); });
//		(x, y) -> (x % y == 0);
		
        // 7. (int x , String str1) -> { return (str1 + x); };
//		(x, str1) -> str1 + x;
		
        // 8. ((int x , String str1) -> { System.out.println(x + str1); });
//		(x, str1) -> System.out.println(x + str1);
		
        // 9. (int[] arr) -> { return (Math.max(Math.max(arr[0], arr[1]), arr[2])); };
//		arr -> Math.max(Math.max(arr[0], arr[1]), arr[2]);
		
        // 10. ((String str1, String str2) -> { String result =  (str1.conact(str2)); return result; });
//		(str1, str2) -> str1.concat(str2);
	}
	
}
