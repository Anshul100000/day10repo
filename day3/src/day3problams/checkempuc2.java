package day3problams;

public class checkempuc2 {
	public static void main(String[]args) {
		int isfulltime = 1;
		int wageperhour = 20;
		int emphrs = 0 , empdailywage = 0;
				double empcheck = Math.floor(Math.random()*10 % 2);
		if (empcheck == isfulltime) {
			emphrs = 8;
			empdailywage = (emphrs*wageperhour);
			System.out.println("employe is present :- "+ empdailywage);
		}
		else {
			System.out.println("employe is absent:-"+ empdailywage );
		}
	}


}
