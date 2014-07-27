import java.util.Scanner;


public class printnumbers {

	public static void main(String[] args) {
    Scanner readInput = new Scanner(System.in);
    
    System.out.println("enter first number");
    int number1 =readInput.nextInt();
    
    System.out.println("enter second number");
    int number2 = readInput.nextInt();
    
    System.out.println("enter third number");
    int number3 = readInput.nextInt();
    
    System.out.println("enter fourth number");
    int number4 = readInput.nextInt();
    
    int sum = number1+number2+number3+number4;
    
    System.out.println("sum:"+sum);
    
    
    

	}

}
