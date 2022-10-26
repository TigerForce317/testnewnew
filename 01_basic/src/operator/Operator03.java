package operator;

import java.util.Scanner;

public class Operator03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하시오 : ");
		
		int number = sc.nextInt();
		
		String result1 = number%2 == 0 ? number + "(은)는 짝수" : number + "(은)는 홀수";
		String result2 = number%2 == 0 && number%3 == 0 ? number + "(은)는 2와 3의 공배수" : number + "(은)는 2와 3의 공배수 아님";
		
		System.out.println(result1);
		System.out.println(result2);
	}
}
/*
 * [문제] 정수를 입력하여 짝수? 홀수?, 2와 3의 공배수이냥? 아니냥?

[실행결과]
정수 입력하시오 : 12
12는 짝수
12는 2와 3의 공배수이다
----------------------
정수 입력하시오 : 15
15는 홀수
15는 2와 3의 공배수 아니다
 **/
