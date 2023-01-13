package ch13;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatEx {
	public static void main(String[] args) {
		//3자리수 콤마 표시
		//1) String 사용
		int val = 1244550000;
		String str = String.format("%,d", val);
		System.out.println(str);
		
		//2) DecimalFormat을 활용
		DecimalFormat df = new DecimalFormat("###,###.##");
		String num = df.format(1230000000.34234);
		System.out.println(num);
				
		//3) NumberFormat 활용
		NumberFormat nf = NumberFormat.getInstance();
		String num2 = nf.format(123599900.34);
		System.out.println(num2);
				
		//getInstance(Locale.국가) - 해당국가 표기법
		NumberFormat n = NumberFormat.getInstance(Locale.ITALY);
		String num3 = n.format(2133.35);
		System.out.println(num3);
	}

}
