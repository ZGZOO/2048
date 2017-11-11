package classes;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame2048 extends JFrame{
	public Frame2048 () {
		this.setVisible(true);
		this.setSize(new Dimension(300,300));
		this.setTitle("2048");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
