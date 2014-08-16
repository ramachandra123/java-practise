import java.util.Scanner;


public class biginteger {

	public static void main(String[] args) {
		int number1,number2;
		
		Scanner in = new Scanner (System.in);
		System.out.println("enter first largest number");
		number1 = in.nextInt();
		
		System.out.println("enter second largest number");
		number2 = in.nextInt();
		
		System.out.println(number1 + number2);
		

	}

}
