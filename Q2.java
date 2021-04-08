package Assignments.Lab1;

public class Q2 {

	public static void main(String[] args) {


		love6(6,4);
		love6(4, 5);
		love6(1, 5);
		love6(12, 6);
		
	}

	private static void love6(int i, int j) {

	
		if (i==6||j==6) {
			System.out.println(true);
		}
		else if ((i+j)==6||(i-j)==6) {
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}

}
