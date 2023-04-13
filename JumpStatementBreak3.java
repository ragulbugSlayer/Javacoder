package tamilhackstutorials;

public class JumpStatementBreak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// arrays
		// i= iterator
	outerLoop:   //This are called Labels..Used to Name the Specific code.
		for(int i=1;i<=6;i++) {  //i controls row
	        innerLoop:		
			  for(int j=1;j<=5  ;++j){//j indicates column
		         	if(i==4 && j==3)
		         		
		         	    break outerLoop;
		      System.out.print(i);
	}
			         System.out.print("\n");
}
	}
}



