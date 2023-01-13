package ch16;

public class MyThread_Ex extends Thread{
	String st;
	

	public MyThread_Ex(String st) {
		this.st = st;
	}
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
			System.out.println(st+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
