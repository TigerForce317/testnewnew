package operator;

import java.text.DecimalFormat;
import java.util.*;
public class Salary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		DecimalFormat df = new DecimalFormat("###,###");
		
		
		System.out.print("이름 입력 : ");
		String name = sc.next();
		System.out.print("직급 입력 : ");
		String rank = sc.next();
		System.out.print("기본급 입력 : ");
		int salary = sc.nextInt();
		System.out.print("수당 입력 : ");
		int over = sc.nextInt();
		
		int sum = salary + over;
		
		
		System.out.println(" *** "+ name + " " + rank + " 월급 *** ");
		System.out.println("기본급 : " + df.format(salary));
		System.out.println("수당 : " + df.format(over));
		System.out.println("합계 : " + df.format(sum));
		
		double result1 = sum >= 5000000 ? sum >= 3000000 ? 0.03 : 0.02 : 0.01; 
		// 조건 ? 참 : 거짓;
		// 조건 ? 참 : 조건 ? 참 : 거짓;
		
		double tax1 = sum*result1;
		System.out.println("세금 : " + df.format(tax1));
		System.out.println("월급 : " + df.format(sum-tax1));
	}
}
/*
단 합계가 5,000,000원 이상이면 3%
3,000,000원 이상이면 2%
아니면 1%

합계 = 기본급 + 수당
세금 = 합계 * 세율
월급 = 합계 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4900000
수당 입력 : 200000

*** 홍길동 부장 월급 ***
기본급 : 4,900,000원
수당 : 200,000원
합계 : 5,100,000원
세금 : 153,000원
월급 : 4,947,000원
*/