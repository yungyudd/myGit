package ch08;

public class Person {
	private String name;
	private int height;
	private int weight;
	
	//생성자의 주 역할은 setter역할이다.
	public Person() {
		this("홍길동", 178, 75);//(Stirng, int, int)형태의 다른 생성자 호출
	}
	public Person(String name) {
		this(name, 180, 84);
	}
	public Person(String name, int height) {
		this(name, height, 70);//다른 생성자 호출
	}
	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public void showInfo() {
		System.out.println("==신상 정보==");
		System.out.println("이름: "+name+"\n신장: "+height+"\n몸무게: "+weight);
	}

}
