package tamilhackstutorials;

public class MethodDemo2 {
	
	static int boxVolume(int length,int breadth,int height) { // creating first method
		int vol;
		vol=length*breadth*height; //this four line of code are called as methods you can use it below at several times
		return vol;
		
	}
			static void printLine() { //Creating Second Method..there is no return type so we use void here
			
				System.out.println("------------------------------");

				
			}
	public static void main(String[] args) {
		printLine();
		System.out.println("HELLO");
		System.out.println(boxVolume(10,4,4)); //Simple way of method declaring
		printLine();
  }
}
