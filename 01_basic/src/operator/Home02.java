package operator;

public class Home02 {

	public static void main(String[] args) {
			
			// 대 -> 소
			char ch = 'Y';	
	        	
			char ch1 = (char)(ch + 32);
	        	
			System.out.print(ch + " -> " + ch1 +"\t\t");
			
			// 소 -> 대
			char ch2 = 'n';	
        	
			char ch3 = (char)(ch2 - 32);
	        	
			System.out.println(ch2 + " -> " + ch3);
			
		
	}
}
/*
 * 답--------------------
 * package operator;

public class Home02 {

   public static void main(String[] args) {
      //char ch = 'B';
      char ch = 'e';
            
      int result = ch>='A' && ch<='Z' ?  ch+32 : ch-32;
      System.out.println(ch + " → " + (char)result);   
   }

}

/*[문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오

[실행결과]
B -> b         e -> E
 
 
          ---------------------------------
          스캐너로 char형 받기, 대소문자 변환
		Scanner sc = new Scanner(System.in);
		
		System.out.print("대문자 입력 : ");
		char ch = sc.next().charAt(0);
		
		char ch2 = (char)(ch + 32);
		System.out.println(ch + " -> " + ch2);
		
		System.out.print("소문자 입력 : ");
		char ch3 = sc.next().charAt(0);
		
		char ch4 = (char)(ch3 - 32);
		System.out.println(ch3 + " -> " + ch4);
		/
*/