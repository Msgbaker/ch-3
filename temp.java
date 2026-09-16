import java.util.Scanner;

public class temp{
	public static void main(String[] arg){
		Scanner in = new Scanner(System.in);
		System.out.print("Celsius conversion: ");
		final double CELSIUS = in.nextDouble();
		final double FAHRENHEIT_PER_CELSIUS = CELSIUS * 9.0/5.0 + 32;
		System.out.printf("%.1f C = %.1f F", CELSIUS, FAHRENHEIT_PER_CELSIUS);
	}
}
