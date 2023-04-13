package tamilhackstutorials;

public class Rough{


	public static void main(String[] args) {

		int i=1634 ,j,k=0,l=i;

		while (i>0) {

			j=i%10;
			i=i/10;
			k +=  (Math.pow(j, i));;
//			System.out.println(i);
//			System.out.println(j);
//			System.out.println(k);
//			System.out.println(l);
			
		}
		if (l==k) {
			System.out.println(l+" Is an armstrong number");
		}
		else {
			System.out.println(l+" Is not an armstrong number");
		}
	}
}
