package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapList {
	static void print(Map<String, Object> map) {
		ArrayList<Student> list2=(ArrayList<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s.getNum()+"\t"+s.getName()+"\t"+s.getMajor()+"\t"+s.getYear()+"\t"+s.getProfessor());
		}
	}
	public static void main(String[] args) {
		Map<String,Object> map = new HashMap<>();//맵 인스턴스
		List<Student> li = new ArrayList<>(); //리스트 인스턴스
		li.add(new Student("2023", "kim", "컴공", 1, "park"));
		li.add(new Student("2022", "lee", "컴공", 2, "bark"));
		li.add(new Student("2021", "jung", "컴공", 3, "qark"));
		map.put("list", li);//맵에 리스트 추가
		print(map);//압축파일처럼 list안의 3개의 객체가 map에 담겨져 print쪽 매개변수화 되어 값을 넘김
	}

}
