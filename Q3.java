package Assignments.Lab1;

public class Q3 {

	public static void main(String[] args) {


		special11(22);
		special11(23);
		special11(24);
		
		
	}

	private static void special11(int i) {

		if (i%11==0||i%11==1) {
			System.out.println(true);
			
		} else {
			System.out.println(false);

		}
		}
	}


