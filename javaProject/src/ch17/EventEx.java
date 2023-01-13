package ch17;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트 처리 3대요소 : 1 이벤트 소스, 2 이벤트 처리기(클래스), 3 이벤트 리스너
public class EventEx extends Frame implements WindowListener{

	public EventEx() {
		addWindowListener(this);//(new..)해서 하지 않고 WindowListener를 상속받아 쓰면 this로도 사용가능
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new EventEx();
	}
	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}

}
