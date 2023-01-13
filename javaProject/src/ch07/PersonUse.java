package ch07;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("김철수");
		p1.setAge(22);
		
		p1.print();
		
		System.out.println("이름: "+p1.getName());
		System.out.println("나이: "+p1.getAge());
//		p1.name = "김철수";
//		p1.age = 22;
//		p1.height = 178.2;
//		System.out.println("이름: "+p1.name+ "\n나이: "+p1.age+"\n키: "+p1.height);
	}

}
