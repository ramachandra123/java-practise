import java.util.Scanner;

public class raitubazar {

	public static void main(String[] args) {
		Scanner readValues = new Scanner(System.in);
		System.out.println("Enter potato price");
		double potatoPrice = readValues.nextDouble();

		System.out.println("no of kgs of potatoes purchased");
		double noOfKgsOfPotatoes = readValues.nextDouble();

		System.out.println("Enter tomato price");
		double tomatoPrice = readValues.nextDouble();
		System.out.println("no  of kgs of tomatoes purchased");
		double noOfKgsOfTomatoes = readValues.nextDouble();

		double totalbill = potatoPrice * noOfKgsOfPotatoes + tomatoPrice
				* noOfKgsOfTomatoes;
		for (int first = 1; first <= 50; first++) {
			System.out.print("+");
		}

		System.out.println("");

		System.out.println("total bill:" + totalbill);
		for (int first = 1; first <= 50; first++) {
			System.out.print("+");

		}
	}

}
