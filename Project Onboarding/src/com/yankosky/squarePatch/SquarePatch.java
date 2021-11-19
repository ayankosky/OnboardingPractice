package com.yankosky.squarePatch;

import java.util.Arrays;

public class SquarePatch {
	
	public void printSquare(int input) {
		int[][] square = new int[input][input];
		
		if(input < 0) {
			System.out.println("please enter a valid number");
		}
		
		for(int squares[] : square) {
			Arrays.fill(squares, input);
			for(int i = 0; i < input; i++) {
				System.out.print(squares[i]);
				
			}
			System.out.print("\n");
		}
		
		
	}

}
