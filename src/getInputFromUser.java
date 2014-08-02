import java.util.Scanner;

public class getInputFromUser {

	public static void main(String[] args) {
		int a;
		float b;
		String s;

		Scanner in = new Scanner(System.in);

		System.out.println("enter an integer");
		a = in.nextInt();

		System.out.println("you entered an integer" + a);

		System.out.println("enter an string");
		s = in.nextLine();
		System.out.println("you entered a string" + s);

		System.out.println("enter a float");
		b = in.nextFloat();
		System.out.println("you entered a float" + b);

	}
}
