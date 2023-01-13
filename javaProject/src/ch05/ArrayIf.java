package ch05;

public class ArrayIf {

	public static void main(String[] args) {
		int[] arr = {12, 13, 14,15,16,18,50,10,260,46};
		
		if(arr != null) {//arr이 주소번지가 null이 아닌 조건
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+ ",");
			}
		}

	}

}
