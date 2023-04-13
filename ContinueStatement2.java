package tamilhackstutorials;

public class ContinueStatement2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,j=1;
	outer:	
		for(i=1;i<=5;i++) {
	inner:	
		   for(j=1;j<=i;j++) {
		       if( i==2 && j==2)
		          continue outer;
		            System.out.print("*");
	}
	System.out.print("\n");
		}
	}
}
