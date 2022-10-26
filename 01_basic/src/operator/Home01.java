package operator;

public class Home01 {

	public static void main(String[] args) {
		int a = ((int)(Math.random()* 6 + 1));
		int b = ((int)(Math.random()* 6 + 1));
		
		System.out.println("주사위1 : " + a +"\t"+ "주사위2 : " + b);
		
		String result = a > b ?  "주사위1이 " + a + " 으로 승" : a < b ?  "주사위2가 " + b +" 으로 승" : "비겼다";
		System.out.println(result);
		System.out.println("주사위 합 : " + (a+b));

	}

}
/*
 * Random r = new Random();
 * r.nextInt(6) + 1 ---> import java.util.Random 으로도 가능
 * 
[문제] 주사위 게임 - 난수
2개의 주사위를 던져서 큰값을 가진 주사위가 승이다.
주사위 값의 합도 출력하시오

[실행결과]
주사위1 : 3   주사위2 : 1
주사위1 이 3으로 승
합 = 4
-----------------------------
주사위1 : 4   주사위2 : 6
주사위2 이 6으로 승
합 = 10
-----------------------------
주사위1 : 3   주사위2 :3
주사위1과 주사위2가 같다
합 = 6
 */
