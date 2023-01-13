package ch17;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.DomainCombiner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;

import ch07.Car;

public class CardEx extends JFrame {
	CardLayout card;
	Container con;
	public CardEx() {
		super("CardLayout 예제");
		card = new CardLayout();
		con = getContentPane();
		setLayout(card);
		JPanel[] pan = new JPanel[5];
		Color[] color = {Color.red, Color.yellow, Color.green, Color.blue, Color.cyan};
		for(int i=0; i<pan.length; i++) {
			pan[i]=new JPanel(); //패널 생성
			pan[i].setBackground(color[i]);
			add("card"+i, pan[i]);
			//패널에 마우스 이벤트 추가
			pan[i].addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					card.previous(con); //다음화면으로 이동
				}
			});
			setSize(300, 300);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	public static void main(String[] args) {
		new CardEx();
	}
		
}
