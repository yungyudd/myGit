package ch10;

class Test11{
	public void print() {
		System.out.println("tset11");
	}
}

class Test22 extends Test11{

	@Override
	public void print() {//오버라이딩
		super.print();
		System.out.println("test22");
	}
	
}

public class OverriadEx {
	public static void main(String[] args) {
		Test22 t = new Test22();
		t.print();

	}

}
