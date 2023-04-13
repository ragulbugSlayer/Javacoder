package tamilhackstutorials;

public class Stack {

	int s[] =  new int[10];
	int topStack;
	


	Stack() {

		topStack=-1;

	}

	void push (int item){

		if (topStack>=9) 
			System.out.println("Stack Over Flow");
		else 
			s[++topStack]=item;
		}
	

	int pop(){

	if (topStack<=0) 
		System.out.println("Stack Under Flow");
	
	else 
		return s[topStack--];
	
	return -1;	
		
	}
}