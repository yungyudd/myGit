package ch12;

public class InnerExam2 {
	static class Ca{//내부 static class
		int value = 0;
		public void plus() {
			value++;
		}
	}
	
	public static void main(String[] args) {
		// 내부 static 클래스 접근시 외부클래스.내부클래스 참조변수 = new 외부클래스.내부생성자
		InnerExam2.Ca c = new InnerExam2.Ca();
		c.plus();
		System.out.println(c.value);
		
	}

}
