package ch17;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyEventColor extends JFrame implements ActionListener{
	private JFrame j;
	private Color c;
	private Container con;
	private JButton button1, button2, button3, button4;
	
	public MyEventColor(JFrame j, Color c) {
		this.j = j;
		this.c = c;
		con = j.getContentPane();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);
	}
	
		public MyEventColor() {
			
			button1 = new JButton("North");
			button2 = new JButton("East");
			button3 = new JButton("South");
			button4 = new JButton("West");
			add(button1,"North");add(button2, "East"); 
			add(button3,"South");add(button4, "West");

			button1.addActionListener(new MyEventColor(this, Color.red));
			button2.addActionListener(new MyEventColor(this, Color.green));
			button3.addActionListener(new MyEventColor(this, Color.blue));
			button4.addActionListener(new MyEventColor(this, Color.yellow));
			setSize(400,400);
			setVisible(true);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		}		

	public static void main(String[] args) {
		new MyEventColor();
	}
	
}

