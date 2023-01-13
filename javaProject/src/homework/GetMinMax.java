package homework;

public class GetMinMax {

	public static void main(String[] args) { 
		
		int[] a = {79,88,91,33,100,55,95};
		int minimum = a[0];
		int maximum = a[5];
		
		
		for(int i=1; i<a.length; i++) {
			if(a[i]<minimum) {
				minimum = a[i];
			}if (maximum<a[i]) {
				maximum = a[i];
			}
		}	
		System.out.println("최댓값: " +maximum);
		System.out.println("최솟값: " +minimum);

	}

}
