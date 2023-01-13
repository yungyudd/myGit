package ch12;

public class InnerExam3 {
	public void exec() {
		class Cal{//메소드 안에 class선언 (지역충접클래스)
			int value = 0;
			public void plus() {
				value++;
			}
		}//end class
		Cal c = new Cal();
		c.plus();
		System.out.println(c.value);
	}//end method

	public static void main(String[] args) {
		InnerExam3 i = new InnerExam3();
		i.exec();

		
	}

}
