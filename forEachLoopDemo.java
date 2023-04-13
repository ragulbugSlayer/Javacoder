package tamilhackstutorials;

public class forEachLoopDemo {

	public static void main(String[] args) {
		
		int i=0;
		int arr[] = {1,3,4,2,5,8};
		
		/*for(i=0;i<arr.length;i++)
				System.out.println(arr[i]);*/
		
		//or use this below foreach method to do the same operetion written above
		
		for(int x : arr){ //ForEach Loop takes each values one by one and stores in x
			System.out.println(x);
		}
  }
}
