package homework;

public class Employee2Use {

	public static void main(String[] args) {
		Employee2 em = new Employee2();
		em.setName("김철수");
		em.setPart("관리부");
		em.setPosition("과장");
		em.setBasic(300);
		em.calC();
		em.print();
	}

}
