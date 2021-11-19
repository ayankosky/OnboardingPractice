package com.yankosky.runner;

import java.util.Scanner;

import com.yankosky.squarePatch.SquarePatch;

public class Executable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		while(in.hasNext()) {
			
			input = in.nextInt();
			SquarePatch squarePatch = new SquarePatch();
			squarePatch.printSquare(input);
			System.out.println("Please enter a number: ");
		}
		

	}

}
