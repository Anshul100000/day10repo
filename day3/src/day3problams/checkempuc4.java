package day3problams;

public class checkempuc4 {
	public static void main(String[]args) {
		int isfulltime = 1;
		int	isparttime = 2;
		int wageperhr = 20;
		int emphrs = 0;
		int	empwage = 0;
		int numofworkingdays = 20;
		int totalEmphrs = 0;
		
		for (int i=0; i<numofworkingdays ; i++) {
			
			int empcheck = (int)Math.floor(Math.random()*10)%3;
				switch (empcheck) {
					case 1:
						emphrs = 4;
							break;
					case 2:
						emphrs = 8;
							break;
					default:
						emphrs = 0;
							break;
				}
				totalEmphrs = totalEmphrs+emphrs;
		}
				empwage = totalEmphrs*wageperhr;
				System.out.println("employe wage for month:- "+ empwage);
	}
}
