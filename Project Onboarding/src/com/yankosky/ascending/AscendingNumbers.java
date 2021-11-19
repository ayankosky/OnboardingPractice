package com.yankosky.ascending;

import java.util.Scanner;

public class AscendingNumbers {
	

			public boolean ascendingConsecutiveCheck(String input) {
				int start = 0;
				int length = input.length();
				
				for(int i  = 0; i < length/2; i++) {
					String str = input.substring(0,i+1);
					int next = Integer.parseInt(str);
					start = next;
					
					
					
					while(str.length() < length) {
						
						next++;
						str = str + String.valueOf(next);
					}
					if(str.equals(input)) {
						return true;
					}
				}
				return false;
			}
			
			public static void main(String[] args) {
				String input;
				Scanner in = new Scanner(System.in);
				System.out.println("Please enter a number: ");
				
				while(in.hasNext()) {
					input = in.next();
					AscendingNumbers asc = new AscendingNumbers();
					System.out.println(asc.ascendingConsecutiveCheck(input));
					System.out.println("Please enter a number: ");
					
				}
			}
}
