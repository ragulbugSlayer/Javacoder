package tamilhackstutorials;

public class MethodDemo {
	
	static int boxVolume(int length,int breadth,int height) {
		int vol;
		vol=length*breadth*height; //this four line of code are called as methods you can use it below at several times
		return vol;
		
	}

	public static void main(String[] args) {
		
		System.out.println("HELLO");
		
		int volume =boxVolume(10,4,2); //boxVolume is a method we have created above
		int volume1 =boxVolume(10,4,4); // there is another simple way of declaring method..kindly refer MethodDemo2
		System.out.println("The volume is :" +volume);
		System.out.println("The volume is :" +volume1);
  }
}
