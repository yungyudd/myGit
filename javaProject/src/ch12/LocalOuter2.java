package ch12;

public class LocalOuter2 {
	private int data =20;
	void display() {
		class LocalInner2{
			int value = 50;
			void msg() {
				System.out.println(value);
				System.out.println(data); //inner class는 외부클래스의  private변수에 접근 할 수 있다.
			}
		}
		LocalInner2 l = new LocalInner2();
		l.msg();
	}
	
	public static void main(String[] args) {
		LocalOuter2 lo = new LocalOuter2();
		lo.display();
		
	}

}
