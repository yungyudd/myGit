package ch08;

public class PersonUSe {

	public static void main(String[] args) {
		Person p = new Person(); //객체생성 및 기본생성자 호출
		p.showInfo();

		Person p2 = new Person("추신수"); //Person(String) 형태의 생성자 호출
		p2.showInfo();
		
		Person p3 = new Person("양",186);//Person(String,int) 생성자 호출
		p3.showInfo();
		
		Person p4 = new Person("고우석",177,85);
		p4.showInfo();
	}

}
