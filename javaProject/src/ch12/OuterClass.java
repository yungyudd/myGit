package ch12;

public class OuterClass {
	private static int x = 10;
	class Inner {
		int getX() {
			return x;
		}
	}

	public static void main(String[] args) {
		System.out.println(x);
		OuterClass o = new OuterClass();
		OuterClass.Inner in = o.new Inner();
		System.out.println(in.getX());
	}
}
