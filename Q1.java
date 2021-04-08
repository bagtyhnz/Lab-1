package Assignments.Lab1;

public class Q1 {

	public static void main(String[] args) {
	
		stringTimes("Hi", 2);
		System.out.println();
		stringTimes("Hi", 3);
		System.out.println();
		stringTimes("Hi", 1);
	}

	private static void stringTimes(String abc, int i) {

		for (int j = 0; j < i; j++) {
			System.out.print(abc);
		}
		
		
		
	}
}
