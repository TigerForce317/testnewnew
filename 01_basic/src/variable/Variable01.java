package variable;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		boolean a;
		a = false;
		System.out.println(a);
		
		char b = 'A'; // 메모리 안에는 char b에 할당된 자리 2byte 中 0000 0000 0100 0001 로 자리함
		System.out.println(b);
		
		char c = 65; // 0000 0000 0100 0001 -> 2^6 = 64 , 2^0 = 1 ...65... 65는 문자 'A'
		System.out.println(c);
		
		int e = 65;
		System.out.println(e);
		
		int f = 'A';
		System.out.println(f);
		
		long g = 65L; // 65L -> long형 상수
		System.out.println(g);
		
		//float h = 43.8; // 43.8은 double형 상수
		
		float h = 43.8f; // 43.8f 는 float형 상수
		float h2 = (float)43.8; //강제형변환 (Cast 연산)
		System.out.println(h);
		System.out.println(h2);
		
		
		
	}

}
