package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {

	public static void main(String[] args) {
		int num[] = {29,19,34,39,20,35};
		Arrays.sort(num); //오름차순 정렬 함수
		for(int i : num) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//내림차순 정렬 Integer라는 Wrapper class 타입으로 데이터 처리가 되어야하고
		//Collections.reverseOrder()라는 메소드를 써서 처리해야한다.
		Integer rev[] = {29,19,34,39,20,35};
		Arrays.sort(rev, Collections.reverseOrder());
		for(int i : rev) {
			System.out.print(i + " ");
		}

	}

}
