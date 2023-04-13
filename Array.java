package tamilhackstutorials;

import java.util.Arrays;

public class Array {

	public static void main(String[] args) {

		String [] guns = {"AKM","AWM","M416","AKM","AUG","AKM"};
		String [] guns1 = {"AKM","AWM","M416","GROZA","AUG"};
		System.out.println(guns[0]);
		System.out.println(guns[1]);
		System.out.println(Arrays.toString(guns));//t print the data of arrays declared
		System.out.println(guns[guns.length-1]);//to find the last declared array

		for (String Name : guns1) {

			String Print = Name.toString();
			System.out.println("--"+Print+"--");
		}
	}

}
