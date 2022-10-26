package variable;

import java.text.DecimalFormat;

public class CalcTest {

	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		
		int sum = a+b;
		int sub = a-b;
		int mul = a*b;
		double div = (double)a/b; //연산값 자동형변환
		
		System.out.println(a + "+" + b + "=" + sum);
		System.out.println(a + "-" + b + "=" + sub);
		
		System.out.println(a + "*" + b + "=" + new DecimalFormat().format(mul)); // new 를 추가하고 패키지 밑에 import 시키기
		
		
		
		System.out.println(a + "/" + b + "=" + String.format("%.5f", div)); //static 안에 정의되어있음.
	}

}
/*
 [문제] 변수를 이용하여 320, 258의 합을 구하시오.
 
 [실행결과]
 320 + 258 = 
 */
