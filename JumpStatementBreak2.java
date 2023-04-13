package tamilhackstutorials;

import java.util.Scanner;

public class JumpStatementBreak2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question:
		// Sum all the numbers given by user and stop adding while using negative number
		double n,sum=0.0;
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the number. Enter the negative number to stop.");
		
		while(true) {
			n=input.nextDouble();
			
			if(n<0.0){
				break;
			}
			sum+=n;
		}	
		
				System.out.println("Sum is : "+sum);
		}
	}
		
	

