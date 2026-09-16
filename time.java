import java.util.Scanner;

public class time{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.print("Seconds to time converter: ");
		final int SECONDS = in.nextInt();
		final int SECONDS_TO_HOURS = SECONDS / 3600;
		final int MINUTES_LEFT = SECONDS % 3600 / 60;
		final int SECONDS_LEFT = SECONDS % 60;
		System.out.printf("%d seconds = %d hours, %d minutes and %d seconds", SECONDS, SECONDS_TO_HOURS, MINUTES_LEFT, SECONDS_LEFT);
	}
}
