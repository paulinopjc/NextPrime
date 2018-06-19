package com.paulinopjc.nextPrimeNum;

import java.util.Scanner;

public class NextPrime {
	
	public static void main (String args[]) {
		
		Scanner input = new Scanner(System.in);
			
		//try catch block to avoid error from wrong character
			try {
				System.out.print("Enter a Number: ");
				//user inputs number as a string and converts it to int
				String numIn = input.nextLine();
				int num = Integer.parseInt(numIn);
				//input.close();
				
				//prime class called
				Prime p = new Prime();
				
				//flag to control whether program continues or not
				int flag = 0;
				
				//seems to work like recursion but isn't a function, but calls continue to the next prime 
				//after the last if any letter or number key is pressed. does not allow carriage return
				//look into turning into a recursive function
				while(flag==0) {
					
					num = p.Prime(num);
					
					System.out.println("Next Prime is " + num);
					
					System.out.print("Press X to exit or any other key to Continue: ");
					String proceed = input.nextLine();
					
					char proc = proceed.charAt(0);
					
					if(proc == 'X' || proc == 'x') {
						flag = 1;
					}
					else
						flag=0;
					
				}
				input.close();
				
			}
			catch(Exception NumberFormatExpression) {
				System.out.println("Please Enter the Correct Input!");
			}
	}
	
}