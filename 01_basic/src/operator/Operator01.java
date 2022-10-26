package operator;

import java.text.DecimalFormat;

public class Operator01 {

	public static void main(String[] args) {
		int money = 987654321;
		int h = money%1000; 
		int t = h%100;
		int o = t%10;
		
		DecimalFormat df = new DecimalFormat("###,###");
		String mo = df.format(money);
		
		System.out.println("현금 " + mo);
		System.out.println("천의 자리 : " + (money/1000));
		System.out.println("백의 자리 : " + (h/100));
		System.out.println("십의 자리 : " + (t/10));
		System.out.println("일의 자리 : " + (o/1));
	}
}
