package tamilhackstutorials;

import java.util.Scanner;

public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Enter two numbers");

		int a,b,c;
		System.out.println("Enter First Number ");
		char operator;
		a= input.nextInt();
		
		System.out.println("Enter second number");
		b=input.next().charAt(0);
		
		System.out.println("Enter operator + - / * %");
		operator=input.next().charAt(0);
		switch(operator) {
		case '+' :
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case '-' :
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '*' :
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/' :
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		case '%' :
			System.out.println(a+"%"+b+"="+(a%b));
			break;
		default :
			System.out.println("You have entered incorrect operator");
		}
	}

}
