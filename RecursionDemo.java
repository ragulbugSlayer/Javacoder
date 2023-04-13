package tamilhackstutorials;

public class RecursionDemo {

	public static void main(String[] args) {
		
		String s = "123456";
		
		System.out.println(recursiveString(s));
		
	}

	
	private static String recursiveString(String s) {
		
		if (s==null || s.length()<=1 ) {
			
		return s;
		}
		
		return recursiveString(s.substring(1))+ s.charAt(0);
		
	}
	
	
}
