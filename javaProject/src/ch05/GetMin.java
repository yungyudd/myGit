package ch05;

public class GetMin {

	public static void main(String[] args) {
		int s[] = {12,3,56,43,36,34,32,65,3};
		int minimum;
		minimum = s[0];
		for(int i=1; i<s.length; i++) {
			if(s[i] < minimum) {
				minimum = s[i];
			}
		}
		System.out.println("최소값은: " +minimum);

	}

}
