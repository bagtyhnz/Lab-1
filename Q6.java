package Assignments.Lab1;

public class Q6 {

	public static void main(String[] args) {


		cigarParty(30,false);
		cigarParty(50, false);
		cigarParty(70, true);
		
		//cigarParty(30, true);

	}

	private static void cigarParty(int cn, boolean weekend) {

		if (weekend=false) {
			if (cn>=40&&cn<=60) {
				System.out.println(true);
			} else {
				System.out.println(false);

			}
		}
		else {
			if (cn>=40) {
				System.out.println(true);
			} else {
				System.out.println(false);

			}
			
		}

		
	}

}
