package ch13;

import java.util.StringTokenizer;

public class StrToken {
	public static void main(String[] args) {
		String str = "kim,20,180,65,서울,학생";
		
		String[] items = str.split(","); //콤마(,)를 기준으로 데이터 분리
		for(String s : items) {
			System.out.println(s);
		}
		
		//StringTokenizer는 String 객체의 split()등의 메스드들 보다 더 다양한 메소드를 제공한다.
		StringTokenizer st = new StringTokenizer(str, ",");
		int cnt = st.countTokens();
		System.out.println("토큰의 갯수: "+cnt);
		while (st.hasMoreTokens()) {//객체안에 토큰이 하나라도 존재하면 True 없으면 false를 리턴
			System.out.println(st.nextToken()); //객체안 토큰하나를 가져와 반환
		}
	}
}
