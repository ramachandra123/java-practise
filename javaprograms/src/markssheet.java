import java.util.Scanner;

public class markssheet {

	public static void main(String[] args) {
		int marksObtained, passingMarks;

		passingMarks = 40;
		Scanner input = new Scanner(System.in);
		System.out.println("input marks scored by you");
		
		marksObtained = input.nextInt();
		
		if (marksObtained >=passingMarks){
			System.out.println("you passed the exam");
		}
			else{
				System.out.println("you failed the exam  ");
			}
			
		}

	}


