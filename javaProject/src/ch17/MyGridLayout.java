package ch17;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class MyGridLayout extends JFrame{
	public MyGridLayout() {
		super("GirdLayout 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,2));
		c.add(new JLabel("아이디"));
		c.add(new TextField(20));
		c.add(new JLabel("비밀번호"));
		c.add(new JPasswordField(20));
		c.add(new JLabel("이메일"));
		c.add(new TextField(20));
		c.add(new JLabel("hp"));
		c.add(new TextField(20));
		
		setSize(300,150);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new MyGridLayout();
	}

}
