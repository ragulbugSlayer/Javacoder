package tamilhackstutorials;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1, n;
		Scanner input = new  Scanner(System.in);
		
		System.out.println("Enter the stars you want");
		 n=input.nextInt();
		 
		 do {
			 
			 System.out.println("*");
			 i++;
		 }
		 
		 while(i<=n);
	}
	 
}
