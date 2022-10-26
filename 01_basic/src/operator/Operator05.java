package operator;

public class Operator05 {

	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 0 && (num2 += 10) > 0);
		
		System.out.println("result = " + result);
		 
		System.out.println("num1 = " + num1 + " num2 = " + num2);
		//좌항이 거짓이기 때문에 나머지 비교연산은 하지 않음 --> num1 = 10 num2 = 0
		
		System.out.println();
		
		result = ((num1 += 10) > 0 || (num2 += 10) > 0);
		
		System.out.println("result = " + result);
		
		System.out.println("num1 = " + num1 + " num2 = " + num2);
	}

}
