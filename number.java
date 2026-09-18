import java.util.Scanner;

public class number{
	public static void main(String[] arg){
		Scanner in=new Scanner(System.in);
		int myNum;
		System.out.print("Guess my number: ");
		int guess=in.nextInt();
		myNum=(guess+4)/2;
		int diff = Math.abs(guess-myNum);
		System.out.println("you are " + diff + " off clearly we can't mind read O:");
	}
}
