package tamilhackstutorials;

import java.util.Scanner;

public class IfElseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		
		System.out.println("Enter the number");
		Scanner input = new Scanner (System.in);
		
		a=input.nextInt();
		//b=input.nextInt();
		
		if (a>=90)
		{
		System.out.println("A Grade-PASS");
		}
		else if(a>=80){
				System.out.println("B Grade-PASS");
		}
			else if(a>=70) {
				System.out.println("C Grade-PASS");
			}
	              else if(a>=60) {
		              System.out.println("D Grade-PASS");
	}
	                      else if(a<60) {
			               	System.err.println("Fail");
	}
}
}



