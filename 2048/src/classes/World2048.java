package classes;

import java.awt.BorderLayout;
import java.awt.Dimension;

public class World2048 {
	static Block2048 [][] gameblock = new Block2048[4][4];
	
	public World2048() {
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				gameblock[i][j] = null;
	}
	
	public Block2048 randomGenerator() {
		int row = (int)(Math.random() * 4);
		int col = (int)(Math.random() * 4);
		return gameblock[row][col];
	}
	
	public static void checkAndMove(int num) {
		if(num == 1) {
			for(int i = 0; i < 4; i++) 
				for(int j = 3; j >= 0; j--)
					if(gameblock[i][j] != null)
						while(gameblock[i][j-1] == null && j > 0 )
							j--;
		}
		else if(num == 2) {
			for(int i = 3; i >= 0; i--) 
				for(int j = 0; j < 4; j++)
					if(gameblock[i][j] != null)
						while(gameblock[i-1][j] == null && i > 0 )
							i--;
		}
		else if(num == 3) {
			for(int i = 0; i < 4; i++) 
				for(int j = 0; j < 4; j++)
					if(gameblock[i][j] != null)
						while(gameblock[i][j+1] == null && j < 3 )
							j++;
		}
		else if(num == 4) {
			for(int i = 0; i < 4; i++) 
				for(int j = 0; j < 4; j++)
					if(gameblock[i][j] != null)
						while(gameblock[i+1][j] == null && i < 3 )
							i++;
		}
	}
	
	public static void main(String [] args) {
		Frame2048 frame1 = new Frame2048();
		Panel2048 panel1 = new Panel2048();
		frame1.add(panel1, BorderLayout.CENTER);
	}
}
