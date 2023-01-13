package ch14;

import java.util.LinkedList;

public class LinkedExam {
	public static void main(String[] args) {
		//큐구조 : FIFO
		//입력 offer, 출력 poll
		String[] fruits = {"사과","배","포도","딸기","수박"};
		LinkedList<String> li = new LinkedList<>();
		for(String str: fruits) {
			li.offer(str); //큐구조에 자료 입력
		}
		String str ="";
		while((str=(String)li.poll()) != null) {
			//poll()은 자료형이 미정(E)이기 때문에 (String)처럼 자료형을 적어줘야 한다.
			//poll()한 값을 str에 대입하는데, str은 boolean이 아니기 때문에 전체를()로 묶어줘야 한다.
			System.out.println(str+" 삭제되었습니다.");
		}
	}

}
