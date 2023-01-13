package ch13;

public class StrBuildEx {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
		str1.append("I am a");
		StringBuilder str2 = new StringBuilder();
		str2.append(" Java Programmer");
		System.out.println("===============================================");
		System.out.println("append()메소드를 활용: "+str1+str2);
		str2.replace(1, 5, "JSP");
		System.out.println("repalce()를 활용: "+str1+str2);
		System.out.println("substring()을 활용: "+str1.substring(6)+str2);
		System.out.println("===============================================");
	}

}
