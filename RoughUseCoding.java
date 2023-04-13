package tamilhackstutorials;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class RoughUseCoding {

	static int a=10;
	static int b=5;
	
	
	public static void main(String[] args) {
		
		System.out.println("Swaping two numbers");
		System.out.println(a +","+b);

		swapFunction(a,b);
		
		List<Integer> l = new ArrayList<Integer>();
		 Set<String> s = new HashSet();
		 
		 
		l.add(5);
		l.add(5);
	    l.add(6);
	    l.add(3);
	    l.add(5);
	    l.add(4);
	    s.add("A");
	    s.add("A");
	    s.add("A");
	    s.add("a");
	    s.add("s");
	    s.add("d");
	    s.add("D");
		
	    
	    System.out.println(s);
	    System.out.println(l);
	    
	}

	public static void swapFunction(int a,int b){
		int c = a ;
		a=b;
		b=c;
		c=a;
		System.out.println(a +","+b);
	}

	
	
	
}





