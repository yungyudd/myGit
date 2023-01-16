package ch19;

import java.util.Arrays;

public class Add {
	private String memberID;
	public static void main(String[] args) {
		int [] A = {1,2,3,4,5};
		System.out.println(Arrays.toString(A));
		System.out.println(A[0]);
		
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	

}
