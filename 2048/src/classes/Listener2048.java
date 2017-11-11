package classes;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Listener2048 implements KeyListener{

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getKeyCode() == 37) {
			World2048.checkAndMove(1);
		}//left arrow
		
		else if(e.getKeyCode() == 38) {
			World2048.checkAndMove(2);
		}//up arrow
		
		else if(e.getKeyCode() == 39) {
			World2048.checkAndMove(3);
		}//right arrow
		
		else if(e.getKeyCode() == 40) {
			World2048.checkAndMove(4);
		}//down arrow
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
