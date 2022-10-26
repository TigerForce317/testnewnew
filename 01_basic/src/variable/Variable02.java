package variable;

public class Variable02 {
	static int a; // 필드 , static으로 클래스 선언 시 자동 메모리 할당
	int b; // new 필요
	
	public static void main(String[] args) {
		int a; // local variable 지역변수, 쓰레기값 저장
		a = 123; // 반드시 초기화
		
		System.out.println("지역변수 a = " + a);
		
		System.out.println("필드 a = " + Variable02.a); //+ 클래스명.필드명 할 것
		
		System.out.println("필드 b = " + new Variable02().b); 
		
		

	}

}
