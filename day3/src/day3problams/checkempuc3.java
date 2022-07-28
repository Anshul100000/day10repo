package day3problams;

public class checkempuc3 {
	public static void main(String[]args) {
		int isfulltime = 2 , isparttime = 1;
		int wageperhour = 20;
		int emphrs = 0 , empdailywage = 0;
				double empcheck = Math.floor(Math.random()*10 % 3);
		
			if (empcheck == isparttime) {
				emphrs = 4;
				empdailywage = (emphrs*wageperhour);
				System.out.println("employe is present :- "+ empdailywage);
			}
			else if (empcheck == isfulltime) {
				emphrs = 8;
				empdailywage = (emphrs*wageperhour);
				System.out.println("employe is present :- "+ empdailywage);
			}
			else {
				emphrs=0;
					System.out.println("employe is absent :- "+ empdailywage);
			}
	}

}
