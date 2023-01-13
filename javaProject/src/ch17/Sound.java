package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Sound extends JApplet implements ActionListener {
	private AudioClip audio;
	private JButton play, stop, loop;
	@Override
	public void init() {
		setLayout(new FlowLayout());
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		play = new JButton("PLAY");
		stop = new JButton("STOP");
		loop = new JButton("LOOP");
		add(play); add(stop); add(loop);
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		System.out.println(e.getSource());
		if(btn == play) {
			audio.play();
		}else if(btn == stop) {
			audio.stop();
		}else if(btn == loop) {
			audio.loop();
		}
	}

}
