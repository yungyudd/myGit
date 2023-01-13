package practice;

public class dd2 {

	public static void main(String[] args) {
		int s[] = {79,88,57,38,25,59,90,67};
		int min = s[0];
		int max = s[7];
		
		for(int i=0; i<s.length; i++) {
			if(min>s[i]) {
				min=s[i];
			}if(max<s[i]) {
				max=s[i];
			}
	
		}
		System.out.println("출력결과");
		System.out.println("최댓값: "+max);
		System.out.println("최솟값: "+min);

	}

}
