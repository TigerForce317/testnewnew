package operator;

public class Operator04 {

	public static void main(String[] args) {
		int a = 5;
		a += 2;
		a *= 3;
		System.out.println("a = " + a); //21
		
		a++;
		System.out.println("a = " + a); //22
		
		int b = a++;
		
		System.out.println("a = " + a + " b = " + b);
		
		int c = ++a - b--;
		// 1. ++a -> 24
		// 2. int c=a-b (24-22) -> 2
		// 3. b-- -> 21
		System.out.println("a = " + a + " b = " + b + " c = " + c);
		
		System.out.println("a++ = " + a++);
		
		System.out.println("a = " + a);
		
	}

}
