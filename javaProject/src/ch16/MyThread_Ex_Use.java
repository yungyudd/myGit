package ch16;

public class MyThread_Ex_Use {

	public static void main(String[] args) {
		MyThread_Ex t1 = new MyThread_Ex("스레드1 ==>");
		MyThread_Ex t2 = new MyThread_Ex("스레드2 ==>");		
		t1.setPriority(t1.MAX_PRIORITY);
		t2.setPriority(t2.MIN_PRIORITY);
		t1.start();
		t2.start();
		
	}
}
