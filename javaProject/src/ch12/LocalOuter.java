package ch12;

public class LocalOuter {
	private int data = 30;
	void display() {
		class LocalInner{
			void msg() {
				System.out.println(data);
			}
		}//end inner class
		LocalInner l = new LocalInner();
		l.msg();
	}//end display()
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
	}

}
