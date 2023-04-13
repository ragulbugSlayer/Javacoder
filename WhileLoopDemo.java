package tamilhackstutorials;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*int i=1;
		
		while(i<=5);{      //While contains only condition
			System.out.println("5");
			i++;*/
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many stars you want");
		i = input.nextInt();
		while(i<=50){
		
		System.out.println("*");
		i++;
		}
	
	}

}
