package variable;

import java.util.Random;

public class Variable03 {

	public static void main(String[] args) {
		System.out.println("큰 값 = " + Math.max(65484, 654321));
		System.out.println();
		
		System.out.println(Math.random());
		System.out.println((int)(Math.random() * 26 + 65));
		System.out.println((char)(Math.random() * 26 + 65));
		
		System.out.println(new Random().nextDouble()); // 일회성
		
	}

}

/*
 * 난수 - 컴퓨터가 불규칙하게 발생하는 수
 * a와 b사이의 난수 발생 (int)(Math.random * (b-a+1) + a)
 */
