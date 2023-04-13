package tamilhackstutorials;

public class ContinueStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arrays
		// i= iterator
		/*
		 * Continue Statement used to 
		 * skip the current iteration if 
		 * condition is true and then
		 * skips to another iteration
		 */
		int i=1;
		for( i=1;i<=10;++i){
			if (i==7) //Skipping 7 and continues from 8
				continue;  
				System.out.println(i);
				
	        
        }
	}    
 }

