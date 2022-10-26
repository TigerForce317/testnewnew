package boxing;

public class Boxing {

	public static void main(String[] args) {
		int a = 25;
		double b = (double)a / 3; //casting
		
		String c = "25";
		// int d = (int)c; - error
		int d = Integer.parseInt(c); // -> 객체를 캐스팅하려면 Wrapper 클래스로 boxing
		
		//AutoBoxing -> JDK 5.0 부터 가능
		int e = 5;
		
		Integer f = e; //int와 Integer는 같은 형식 -> AutoBoxing 가능
		
		//Integer g = new Integer(e); // jdk 5.0 이전 AutoBoxing 불가 new 사용
		
		Integer h = 5;
		int i = e;//unAutoBoxing = JDK 5.0 부터
		//int j = h.intValue(); // JDK 5.0 이전
	}

}
/*
Autoboxing과 unBoxing은 개발자에게 가독성이 높고 깨끗한 코드를 작성하는데 도움을 준다.
Autoboxing과 unBoxing을 사용한다면 Wrapper클래스 타입과 원시 타입을
 상호 교환 가능하게끔 사용할 수 있고 명시적으로 타입 캐스팅을 수행하지 않아도 된다.
*/