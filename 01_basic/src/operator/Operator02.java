package operator;

import java.util.*;

public class Operator02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하시오. : ");
		
		int score = sc.nextInt();
		
		String result;
		
		result = score>=80 && score<=100 ? "합격" : "불합격";
		
		System.out.println(result);

	}

}
