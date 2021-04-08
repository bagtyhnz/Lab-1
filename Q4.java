package Assignments.Lab1;

public class Q4 {

	public static void main(String[] args) {


		deerPlay(70,false);
		deerPlay(95, false);
		deerPlay(95, true);
//		deerPlay(67, true);
		
	}

	private static void deerPlay(int temp, boolean b) {


	if (b==true) {
			if (temp>=60&&temp<=100) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		} 
		
	else {
			if (temp>=60&&temp<=90) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
				
			}
	}

}
