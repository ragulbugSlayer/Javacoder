package tamilhackstutorials;

public class StaticVariable {
   
	/*In Java, static variables are also called class variables.
	That is, they belong to a class and not a particular instance. 
	As a result, class initialization will initialize static variables. 
	In contrast, a class's instance will initialize the instance variables
*/	
	int x=1;
	static int y=1;

	void increment() {

		x++;
		y++;

		System.out.println("NonStatic==>" + x+"Static==>"+ y);

	}
		public static void main(String[] args) {
			
			StaticVariable Rc = new StaticVariable();
			
			Rc.increment(); 
			Rc.increment(); 
			Rc.increment(); 
			StaticVariable Rc1 = new StaticVariable();
			
			Rc1.increment(); 
			Rc1.increment();
		}
	
	
}

}
