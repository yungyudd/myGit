package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutEx1 extends JFrame {
	public FlowLayoutEx1() {
		setTitle("FlowLayout 예제");
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//FlowLayout 설정
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40)); //(FlowLayout.정렬위치, 좌우간격, 상하간격)
		
		add(new JButton("1"));
		add(new JButton("2"));
		add(new JButton("3"));
		add(new JButton("4"));
		add(new JButton("5"));
	}
	public static void main(String[] args) {
		new FlowLayoutEx1();
	}

}
