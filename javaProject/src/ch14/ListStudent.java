package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student("20170666", "김윤규", "컴공", 4, "홍석주"));
		list.add(new Student("20170667", "김윤지", "국사", 3, "윤회진"));
		list.add(new Student("20170668", "김유미", "영어", 2, "이종석"));
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		
		for(int i=0; i<list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
		
		//for -each 을 쓰면 list.get(i)등의 처리를 안해도 된다.
		for(Student s : list) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}

}
