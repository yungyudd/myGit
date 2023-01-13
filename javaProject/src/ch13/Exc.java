package ch13;

public class Exc {
	public static void main(String[] args) {
		try {
			int[] nums = {10, 20, 3, 04};
			for(int i=0; i<=4; i++) {
				System.out.println(nums[i]);
			}
		} catch (Exception e) {
			System.out.println("프로그램 문제");
		}
		System.out.println("프로그램 종료....");
	
	}

}
