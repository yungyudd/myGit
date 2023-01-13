package ch13;

public class Replace {
	public static void main(String[] args) {
		String a = "java program";
		System.out.println(a.replace("a", "A"));
		a=a.replace("a", "A"); //복사
		System.out.println(a);
				
	}

}
