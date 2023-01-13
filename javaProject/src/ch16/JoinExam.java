package ch16;

public class JoinExam {
	public static void main(String[] args) { //메인스레드는 우선권이 제일높다.
		MyThread3 th = new MyThread3();
		th.start();
		System.out.println("Thread가 종료될때까지 기다립니다.");
		try {
			th.join(); //해당 스레드가 실행종료될때까지 main스레드는 일시정지 상태로 전환됨
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread가 종료되었습니다.");
	}

}
