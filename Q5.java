package Assignments.Lab1;

public class Q5 {

	public static void main(String[] args) {


		caughtSpeeding(60, false);
		caughtSpeeding(65, false);
		caughtSpeeding(65, true);
		
		//caughtSpeeding(87, true);
		
	}

	private static void caughtSpeeding(int speed, boolean b) {

		int result=5;
if (b==false) {
			
		
		if (speed<=60) {
			result=0;
		}
		else if (speed>=61&&speed<=80) {
			result=1;
		}
		else if (speed>81) {
			result=2;
		}	System.out.println(result);


}
else {
	
	if (speed<=65) {
		result=0;
	}
	else if (speed>=66&&speed<=85) {
		result=1;
	}
	else if (speed>86) {
		result=2;
	}
	System.out.println(result);
}

	}

}
