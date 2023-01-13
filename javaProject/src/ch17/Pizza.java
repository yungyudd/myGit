package ch17;

import java.awt.Color;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.DomainCombiner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pizza extends JFrame {
	public Pizza() {
		super("피자 메뉴");
		setSize(500, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pa1 = new JPanel();
		JPanel pa2 = new JPanel();
		JPanel pa3 = new JPanel();
		
		pa1.setBackground(Color.BLUE);
		pa2.setBackground(Color.cyan);
		pa3.setBackground(Color.green);
		
		JLabel la1 = new JLabel("피자 종류를 선택하세요.");
		pa2.add(la1);
		
		JButton button1 = new JButton("치즈");
		JButton button2 = new JButton("불고기");
		JButton button3 = new JButton("포테이토");
		JButton button4 = new JButton("종료");
		
		//pa3에 버튼 추가
		pa3.add(button1); pa3.add(button2);
		pa3.add(button3); pa3.add(button4);
		//pa1에 다른패널 추가
		pa1.add(pa2);
		pa1.add(pa3);
		
		add(pa1, "North");
		setVisible(true);
		
		ActionListener handler = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getActionCommand().equals("치즈")) {
					JOptionPane.showMessageDialog(null, "치즈피자를 선택하셨습니다. \n가격: 23000원", "치즈피자", 
							JOptionPane.INFORMATION_MESSAGE);
				}else if(e.getActionCommand().equals("불고기")) {
					JOptionPane.showMessageDialog(null, "불고기피자를 선택하셨습니다. \n가격: 26000원", "불고기피자", 
							JOptionPane.WARNING_MESSAGE);
				}else if(e.getActionCommand().equals("포테이토")) {
					JOptionPane.showMessageDialog(null, "포테이토피자를 선택하셨습니다. \n가격: 26000원", "포테이토피자", 
							JOptionPane.DEFAULT_OPTION);
				}else if(e.getActionCommand().equals("종료")) {
					JOptionPane.showMessageDialog(null, "프로그램을 정말 종료하시겠습니까?", "종료", 
							JOptionPane.OK_CANCEL_OPTION);
					System.exit(0);
				}
			}
		};
		//버튼에 리스너 부착
		button1.addActionListener(handler);
		button2.addActionListener(handler);
		button3.addActionListener(handler);
		button4.addActionListener(handler);
	}
	public static void main(String[] args) {
		new Pizza();
	}

}
