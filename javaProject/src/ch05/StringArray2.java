package ch05;

public class StringArray2 {

	public static void main(String[] args) {
		String[] str = {"Java", "DB", "JSP", "HTML"};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);
		}


		
		
		//향상된 for문 for~each문
		//for (데이터타입 개별변수 : 집합변수) {}
		for(String aa : str) {
			System.out.println(aa);
		}
	}

}
