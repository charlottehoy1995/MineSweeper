package mineSweepMain;

import java.util.Random;

public class MineSweep {
	
	public static void main(String[] args) {
				
		char [][] mineArray = new char[10][10];
		
		char Bombs[] = {'x', '*'};
		Random r = new Random();
		
		
		for (int i = 0; i< mineArray.length; i++) {
			mineArray[i][i] = Bombs[r.nextInt(Bombs.length)];
			
			for (int j = 0; j < mineArray.length; j++) {
				mineArray[i][j] = Bombs[r.nextInt(Bombs.length)];
				System.out.print(mineArray[i][j]);
				
				
			}
			
			System.out.println();
		}
	}
	
		
	}

