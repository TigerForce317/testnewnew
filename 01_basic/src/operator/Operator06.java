package operator;

public class Operator06 {

	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);
		System.out.println("!a = " + !a); // '!' -> 비교 후 결과값의 반대 출력
		System.out.println();
		
		String b = "apple"; //literal 생성 -> 객체 -> b 에 참조(주소값)
		
		String c = new String("apple");
		System.out.println("b == c : " + (b == c ? "같다" : "다르다")); //참조값 비교
		System.out.println("b != c : " + (b != c ? "참" : "거짓"));
		
		System.out.println();
		
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다"));// equals 로 문자열비교
		System.out.println("!b.equals(c) : " + (!b.equals(c) ? "참" : "거짓"));
		

	}

}
// == 자바, = 오라클, === 자바스크립트