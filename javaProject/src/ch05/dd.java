package ch05;

public class dd {

	public static void main(String[] args) {
		
		int[] nums = {79,88,91,33,100,55,95};
		int min = nums[0], max=0;
		
		for(int i=1; i<nums.length; i++) {
			if(nums[i]<min) {
				min = nums[i];
			}
			if(nums[i]>max) {
				max = nums[i];
			}

		}
		System.out.printf("최대값 : %d\n최소값 : %d", max, min);
		
		
		
		
	}
	
	
}
