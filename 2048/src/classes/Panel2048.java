package classes;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel2048 extends JPanel{
	public Panel2048(){
		
	}
	
	public void paint(Graphics g) {
		int small = 0;
		int f_height = 0;
		int f_width = 0;
		
		g.setColor(Color.WHITE);
		if(this.getWidth() < this.getHeight()) {
			small = this.getWidth();
			f_height = this.getHeight();
			g.fillRect(0, (f_height - small)/2, small, small);
			g.setColor(Color.BLACK);
			//heng xian
			g.drawLine(0, (f_height - small)/2, small, (f_height - small)/2);
			g.drawLine(0, (f_height - small)/2 + small/4, small, (f_height - small)/2 + small/4);
			g.drawLine(0, (f_height - small)/2 + small/2, small, (f_height - small)/2 + small/2);
			g.drawLine(0, (f_height - small)/2 + small*3/4, small, (f_height - small)/2 + small*3/4);
			g.drawLine(0, (f_height - small)/2 + small, small, (f_height - small)/2 + small);
			//shu xian
			g.drawLine(0, (f_height - small)/2, 0, (f_height - small)/2 + small);
			g.drawLine(small/4, (f_height - small)/2, small/4, (f_height - small)/2 + small);
			g.drawLine(small/2, (f_height - small)/2, small/2, (f_height - small)/2 + small);
			g.drawLine(small*3/4, (f_height - small)/2, small*3/4, (f_height - small)/2 + small);
			g.drawLine(small, (f_height - small)/2, small, (f_height - small)/2 + small);
		}else if(this.getWidth() > this.getHeight()){
			small = this.getHeight();
			f_width = this.getWidth();
			g.fillRect((f_width - small)/2, 0, small, small);
			g.setColor(Color.BLACK);
			//heng xian
			g.drawLine((f_width - small)/2, 0, (f_width - small)/2 + small, 0);
			g.drawLine((f_width - small)/2, small/4, (f_width - small)/2 + small, small/4);
			g.drawLine((f_width - small)/2, small/2, (f_width - small)/2 + small, small/2);
			g.drawLine((f_width - small)/2, small*3/4, (f_width - small)/2 + small, small*3/4);
			g.drawLine((f_width - small)/2, small, (f_width - small)/2 + small, small);
			//shu xian
			g.drawLine((f_width - small)/2, 0, (f_width - small)/2, small);
			g.drawLine((f_width - small)/2 + small/4, 0, (f_width - small)/2 + small/4, small);
			g.drawLine((f_width - small)/2 + small/2, 0, (f_width - small)/2 + small/2, small);
			g.drawLine((f_width - small)/2 + small*3/4, 0, (f_width - small)/2 + small*3/4, small);
			g.drawLine((f_width - small)/2 + small, 0, (f_width - small)/2 + small, small);
		}
	}
	
	
}
	
