package variable;

import java.util.Random;

public class Variable04 {

	public static void main(String[] args) {
		int a = 10; // 정수형 변수 , 지역변수
		System.out.println("지역변수 a = " + a);
		System.out.println();
		
		Random r = new Random(); //객체(클래스형 변수)-> 형식 클래스@16진수 (주소를 가짐)
		System.out.println("객체 r = " + r);
		System.out.println(r.nextDouble()); // r로 객체생성 -> 재사용가능
		System.out.println(r.nextInt());
		System.out.println(r.nextInt(100));
		System.out.println(r.nextInt(26) + 65);
		System.out.println();
		
		String b = new String("사과");
		String c = new String("딸기");
		String h = "바나나"; // 문자열 리터럴 생성
		
		System.out.println(b + "\t" + c + "\t" + h);
		
	}
}


