package ch04;

public class wzrn {

	public static void main(String[] args) {
		System.out.println("출력결과:");
		for(int i=2; i<=9; i++) {
			System.out.println("## "+i+"단 ##");
			for(int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println("\n");
		}
		

	}

}
