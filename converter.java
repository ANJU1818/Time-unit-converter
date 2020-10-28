	import java.util.Scanner;
     		public class Time {

			public static void main(String[]args){
			int totalseconds;
			int minutes;
			int hours;
			int seconds;
			Scanner s = new Scanner(System.in);
	
				System.out.println("Enter the number of seconds:");
				totalseconds = s.nextInt();
				hours = totalseconds/3600;
				minutes = (totalseconds%3600)/60;
				seconds = (totalseconds%3600)%60;
	
			System.out.println("Hours:"+hours);
			System.out.println("Minutes"+minutes);
			System.out.println("Seconds"+seconds);
	
	}
}
