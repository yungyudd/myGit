package ch13;

public class StrMethod {
	public static void main(String[] args) {
		String str1= "java";
		str1 += " programming"; //문자열 연결이지만 실제로 새로운 문자열을 만들고 str1은 새로운 문자열의 주소값을 가리키게됨
		System.out.println(str1);
		System.out.println(str1.length());//문자열의 길이
		String str2 = str1.concat(" programmer"); //concat()도 문자열 연결시킴
		System.out.println(str2);
		System.out.println(str1.charAt(2)); //index의 n번째 문자
		System.out.println(str2.indexOf("program")); 
		System.out.println(str2.indexOf("z")); //내용이 없으면 -1을 리턴
		System.out.println(str2.substring(0,4)); // substring(start, end-1) => (0,3)
		System.out.println(str2.substring(5)); // 5~끝까지
		System.out.println(str2.replace("java", "jsp"));
		System.out.println(str2);
		str2 = str2.replace("java" , "js");
		System.out.println(str2);
		
		String str3 = "3242552399";
		System.out.println(str3.substring(5,8));
		System.out.println(str3.replace(str3.substring(5, 8), "***"));
	}

}
