package tamilhackstutorials;

import java.util.Scanner;

public class JumpStatementBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number:  ");
		n=input.nextInt();
		
		while (n>=0) {
			if(n%10==0) {
			System.out.println(n);
			break;
		}
		n--;
		}
	}
		
	}


